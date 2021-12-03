package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class empleadosService {
    @Autowired
    lateinit var empleadosRepository: empleadosRepository


    fun list(): List<empleadosTabla> {

        return empleadosRepository.findAll()
    }
    fun save(empleadosTabla: empleadosTabla):empleadosTabla{
        return empleadosRepository.save(empleadosTabla)
    }

    fun update(empleadosTabla: empleadosTabla):empleadosTabla{
        return empleadosRepository.save(empleadosTabla)
    }

    fun delete (id:Long): Boolean{
        empleadosRepository.deleteById(id)
        return true
    }
}