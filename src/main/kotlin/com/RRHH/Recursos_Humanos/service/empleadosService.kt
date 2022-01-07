package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.departamentoTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class empleadosService {
    @Autowired
    lateinit var empleadosRepository: empleadosRepository


    fun list(): List<empleadosTabla> {

        return empleadosRepository.findAll()
    }
    fun save(empleadosTabla: empleadosTabla):empleadosTabla{

        try {


            if(empleadosTabla.nombre?.trim()?.isEmpty() == true || empleadosTabla.apellido?.trim()?.isEmpty() == true
                || empleadosTabla.cedula?.trim()?.isEmpty() == true || empleadosTabla.direccion?.trim()?.isEmpty() == true
                || empleadosTabla.edad?.trim()?.isEmpty() == true || empleadosTabla.telefono?.trim()?.isEmpty() == true
            )
            {
                throw Exception("Ningun campo puede estar vacio")
            }
            return empleadosRepository.save(empleadosTabla)

        }catch (ex: Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)


        }



        return empleadosRepository.save(empleadosTabla)
    }

    fun update(empleadosTabla: empleadosTabla):empleadosTabla{
        return empleadosRepository.save(empleadosTabla)
    }

    fun updateDescription (empleadosTabla: empleadosTabla): empleadosTabla {
        val response = empleadosRepository.findById(empleadosTabla.id)
            ?:
       throw Exception("id no existe")


        response.apply {
            this.nombre=empleadosTabla.nombre;
            this.apellido=empleadosTabla.apellido;
            this.cedula=empleadosTabla.cedula;
            this.direccion=empleadosTabla.direccion;
            this.edad=empleadosTabla.edad;
            this.telefono=empleadosTabla.telefono;

        }

        return empleadosRepository.save(empleadosTabla)
    }


    fun delete (id:Long): Boolean{
        empleadosRepository.deleteById(id)
        return true
    }
}