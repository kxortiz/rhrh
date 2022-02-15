package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.departamentoTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.asignacionRepository
import com.RRHH.Recursos_Humanos.repository.departamentoRepository
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class departamentoService {
    @Autowired
    lateinit var departamentoRepository: departamentoRepository


    fun list(): List<departamentoTabla> {

        return departamentoRepository.findAll()
    }
    fun save(departamentoTabla: departamentoTabla):departamentoTabla{
        try {


            if(departamentoTabla.descripcion?.trim()?.isEmpty() == true)

                {
                    throw Exception("Ningun campo puede estar vacio")
                }
            return departamentoRepository.save(departamentoTabla)

        }catch (ex: Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)


        }


        return departamentoRepository.save(departamentoTabla)
    }

    fun update(departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoRepository.save(departamentoTabla)
    }

    fun updateDescription (departamentoTabla: departamentoTabla):departamentoTabla {
        val response = departamentoRepository.findById(departamentoTabla.id)
            ?: throw Exception()
        response.apply {
            this.descripcion=departamentoTabla.descripcion;


        }

        return departamentoRepository.save(departamentoTabla)
    }

    fun delete (id:Long): Boolean{
        departamentoRepository.deleteById(id)
        return true
    }

    fun get (id:Long): departamentoTabla{
        return departamentoRepository.getById(id)
    }
}