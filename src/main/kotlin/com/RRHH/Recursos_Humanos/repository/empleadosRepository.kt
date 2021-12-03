package com.RRHH.Recursos_Humanos.repository

import com.RRHH.Recursos_Humanos.model.empleadosTabla
import org.springframework.data.jpa.repository.JpaRepository

interface empleadosRepository:JpaRepository<empleadosTabla,Long> {

}