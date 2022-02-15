package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.departamentoTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.asignacionRepository
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class asignacionService {
    @Autowired
    lateinit var asignacionRepository: asignacionRepository


    fun list(): List<asignacionTabla> {

        return asignacionRepository.findAll()
    }
    fun save(asignacionTabla: asignacionTabla):asignacionTabla{

        try {

            if(asignacionTabla.fecha?.trim()?.isEmpty() == true || asignacionTabla.observacion?.trim()?.isEmpty() == true

            ){
                throw Exception("Ningun campo puede estar vacio")
            }

        {
            throw Exception("Ningun campo puede estar vacio")
        }
            return asignacionRepository.save(asignacionTabla)

        }catch (ex: Exception){
            throw ResponseStatusException(
                HttpStatus.NOT_FOUND, ex.message, ex)


        }
        return asignacionRepository.save(asignacionTabla)

    }

    fun update(asignacionTabla: asignacionTabla):asignacionTabla{
        return asignacionRepository.save(asignacionTabla)
    }

    fun updateDescription (asignacionTabla: asignacionTabla):asignacionTabla {
        val response = asignacionRepository.findById(asignacionTabla.id)
        ?: throw Exception()
        response.apply {
            this.fecha=asignacionTabla.fecha;
            this.observacion=asignacionTabla.observacion;

        }


        return asignacionRepository.save(asignacionTabla)
    }

    fun delete (id:Long): Boolean{
        asignacionRepository.deleteById(id)
        return true
    }

    fun get (id:Long): asignacionTabla {
        return asignacionRepository.getById(id)
    }
}