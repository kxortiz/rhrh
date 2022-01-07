package com.RRHH.Recursos_Humanos.controllers

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.departamentoTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.repository.departamentoRepository
import com.RRHH.Recursos_Humanos.service.asignacionService
import com.RRHH.Recursos_Humanos.service.departamentoService
import com.RRHH.Recursos_Humanos.service.empleadosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/departamento")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class departamentoController {
    @Autowired
    lateinit var departamentoService: departamentoService

    @GetMapping
    fun list(): List<departamentoTabla>{
        return departamentoService.list()
    }
    @PostMapping
    fun save(@RequestBody departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoService.save(departamentoTabla)
    }

    @PutMapping
    fun update (@RequestBody departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoService.update(departamentoTabla)
    }

    @PatchMapping
    fun updateDescription (@RequestBody departamentoTabla: departamentoTabla):departamentoTabla{
        return departamentoService.updateDescription(departamentoTabla)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return departamentoService.delete(id)
    }



}
