package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.asignacionRepository
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class asignacionService {
    @Autowired
    lateinit var asignacionRepository: asignacionRepository


    fun list(): List<asignacionTabla> {

        return asignacionRepository.findAll()
    }
    fun save(asignacionTabla: asignacionTabla):asignacionTabla{
        return asignacionRepository.save(asignacionTabla)
    }

    fun update(asignacionTabla: asignacionTabla):asignacionTabla{
        return asignacionRepository.save(asignacionTabla)
    }

    fun delete (id:Long): Boolean{
        asignacionRepository.deleteById(id)
        return true
    }
}