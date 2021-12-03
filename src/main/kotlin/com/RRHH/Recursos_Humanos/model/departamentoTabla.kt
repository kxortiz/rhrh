package com.RRHH.Recursos_Humanos.model

import javax.persistence.*

@Entity
@Table(name = "departamento")
class departamentoTabla {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var descripcion: String? = null



}