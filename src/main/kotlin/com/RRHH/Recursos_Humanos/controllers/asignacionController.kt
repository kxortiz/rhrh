package com.RRHH.Recursos_Humanos.controllers

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.service.asignacionService
import com.RRHH.Recursos_Humanos.service.empleadosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/asignacion")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class asignacionController {
    @Autowired
    lateinit var asignacionService: asignacionService

    @GetMapping
    fun list(): List<asignacionTabla>{
        return asignacionService.list()
    }
    @PostMapping
    fun save(@RequestBody asignacionTabla: asignacionTabla):asignacionTabla{
        return asignacionService.save(asignacionTabla)
    }

    @PutMapping
    fun update (@RequestBody asignacionTabla: asignacionTabla):asignacionTabla{
        return asignacionService.update(asignacionTabla)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return asignacionService.delete(id)
    }



}
