CREATE TABLE IF NOT EXISTS  empleados
    (id serial,
    nombre VARCHAR(45) NOT NULL,
    apellido VARCHAR(45) NOT NULL,
    cedula VARCHAR(45) NOT NULL,
    direccion VARCHAR(45) NOT NULL,
    edad VARCHAR (45) NOT NULL,
    telefono VARCHAR (45) NOT NULL,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS  asignacion
    (id serial,
     fecha VARCHAR(45) NOT NULL,
    observacion VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
    );


CREATE TABLE IF NOT EXISTS  departamento
    (id serial,
    descripcion VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
    );
