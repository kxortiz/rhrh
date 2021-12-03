package com.RRHH.Recursos_Humanos.model

import javax.persistence.*

@Entity
@Table(name = "asignacion")
class asignacionTabla {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var fecha: String? = null
    var observacion: String? = null


}