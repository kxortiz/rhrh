package com.RRHH.Recursos_Humanos.controllers

import com.RRHH.Recursos_Humanos.model.asignacionTabla
import com.RRHH.Recursos_Humanos.model.empleadosTabla
import com.RRHH.Recursos_Humanos.service.empleadosService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/empleados")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class empleadosController {
    @Autowired
    lateinit var empleadosService: empleadosService

    @GetMapping
    fun list(): List<empleadosTabla>{
        return empleadosService.list()
    }
    @PostMapping
    fun save(@RequestBody empleadosTabla: empleadosTabla):empleadosTabla{
        return empleadosService.save(empleadosTabla)
    }

    @PutMapping
    fun update (@RequestBody empleadosTabla: empleadosTabla):empleadosTabla{
        return empleadosService.update(empleadosTabla)
    }

    @PatchMapping
    fun updateDescription (@RequestBody empleadosTabla: empleadosTabla): empleadosTabla {
        return empleadosService.updateDescription(empleadosTabla)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return empleadosService.delete(id)
    }



}
