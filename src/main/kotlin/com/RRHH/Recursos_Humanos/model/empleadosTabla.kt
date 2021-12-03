package com.RRHH.Recursos_Humanos.model

import javax.persistence.*

@Entity
@Table(name = "Empleados")
class empleadosTabla {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var apellido: String? = null
    var cedula: String? = null
    var direccion: String? = null
    var edad: String? = null
    var telefono: String? = null

}