package com.RRHH.Recursos_Humanos.service

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.departamentoTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.asignacionRepository
import com.RRHH.Recursos_Humanos.repository.departamentoRepository
import com.RRHH.Recursos_Humanos.repository.empleadosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class departamentoService {
    @Autowired
    lateinit var departamentoRepository: departamentoRepository


    fun list(): List<departamentoTabla> {

        return departamentoRepository.findAll()
    }
    fun save(departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoRepository.save(departamentoTabla)
    }

    fun update(departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoRepository.save(departamentoTabla)
    }

    fun delete (id:Long): Boolean{
        departamentoRepository.deleteById(id)
        return true
    }
}