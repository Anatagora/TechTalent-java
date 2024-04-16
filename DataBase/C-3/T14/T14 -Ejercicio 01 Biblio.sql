CREATE DATABASE Biblio
USE Biblio; 

CREATE TABLE editorial (
    clave_editorial SMALLINT NOT NULL, 
    nombre VARCHAR(60), 
    direccion VARCHAR(60),
    telefono VARCHAR(15),
    PRIMARY KEY (clave_editorial) 
); 

CREATE TABLE tema (
    clave_tema SMALLINT NOT NULL, 
    nombre VARCHAR (40), 
    PRIMARY KEY (clave_tema)
); 

CREATE TABLE autor (
    clave_autor SMALLINT NOT NULL,
    nombre VARCHAR (60), 
    PRIMARY KEY (clave_autor)
);  

CREATE TABLE socio (
    clave_socio SMALLINT NOT NULL, 
    nombre VARCHAR (60), 
    direccion VARCHAR (60), 
    telefono VARCHAR (15), 
    categoria CHAR, 
    PRIMARY KEY (clave_socio)
); 

CREATE TABLE libro (
    clave_libro SMALLINT NOT NULL, 
    titulo VARCHAR (60), 
    idioma VARCHAR (15), 
    formato VARCHAR (15), 
    clave_editorial SMALLINT, 
    PRIMARY KEY (clave_libro), 
    KEY (clave_editorial),
    FOREIGN KEY (clave_editorial)
    REFERENCES editorial(clave_editorial)
    ON DELETE SET NULL 
    ON UPDATE CASCADE
); 
--------------
CREATE TABLE ejemplar (
    clave_ejemplar INT NOT NULL, 
    clave_libro SMALLINT NOT NULL, 
    numero_orden SMALLINT NOT NULL, 
    edicion SMALLINT, 
    ubicacion VARCHAR (15), 
    categoria CHAR(1), 
    PRIMARY KEY (clave_ejemplar), 
    KEY (clave_libro),
    FOREIGN KEY (clave_libro)
    REFERENCES libro(clave_libro)
    ON DELETE CASCADE
    ON UPDATE CASCADE
); 

CREATE TABLE prestamo (
    clave_socio SMALLINT, 
    clave_ejemplar INT, 
    numero_orden SMALLINT, 
    fecha_prestamo DATE DEFAULT NULL, 
    fecha_devolucion DATE DEFAULT NULL, 
    notas BLOB, 
    FOREIGN key (clave_socio) 
    REFERENCES socio (clave_socio)
    ON DELETE CASCADE 
    ON UPDATE CASCADE, 
    FOREIGN KEY (clave_ejemplar) 
    REFERENCES ejemplar (clave_ejemplar)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
); 

CREATE TABLE trata_sobre ( 
    clave_libro SMALLINT, 
    clave_tema SMALLINT, 
    FOREIGN KEY (clave_libro)
    REFERENCES libro (clave_libro)
    ON DELETE CASCADE 
    ON UPDATE CASCADE, 
    FOREIGN KEY (clave_tema) 
    REFERENCES tema(clave_tema)
    ON DELETE CASCADE  
    ON UPDATE CASCADE
); 

CREATE TABLE escrito_por ( 
    clave_libro SMALLINT, 
    clave_autor SMALLINT, 
    FOREIGN KEY (clave_libro)
    REFERENCES libro (clave_libro)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    FOREIGN KEY (clave_autor)
    REFERENCES autor (clave_autor)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);