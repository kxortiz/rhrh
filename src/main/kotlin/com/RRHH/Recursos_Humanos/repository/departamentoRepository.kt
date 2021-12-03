package com.RRHH.Recursos_Humanos.repository

import com.RRHH.Recursos_Humanos.model.departamentoTabla
import org.springframework.data.jpa.repository.JpaRepository

interface departamentoRepository:JpaRepository<departamentoTabla,Long> {

}