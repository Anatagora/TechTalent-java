CREATE DATABASE academia_idiomas
USE academia_idiomas; 

CREATE TABLE profesores(
nom_apels VARCHAR(255), 
UNIQUE (nom_apels), 
dni_profesor VARCHAR(8), 
PRIMARY KEY (dni_profesor), 
direccion VARCHAR (100), 
titulo VARCHAR(50), 
nomina SMALLINT NOT NULL
);

CREATE TABLE cursos(
nombre_curso VARCHAR(80), 
UNIQUE (nombre_curso), 
cod_curso INT, 
PRIMARY KEY (cod_curso), 
max_alumnos INT, 
fecha_inicio DATE DEFAULT, 
fecha_fin DATE, 
CONSTRAIN fecha_curso CHECK(fecha_inicio < fecha_fin),
num_horas INT NOT NULL
dni_profesor VARCHAR(8), 
FOREIGN KEY (dni_profesor)
    REFERENCES profesores (dni_profesor)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);

CREATE TABLE alumnos(
nom_apels VARCHAR(255), 
dni_alumno VARCHAR(8), 
PRIMARY KEY(dni_alumno), 
direccion VARCHAR(100),
sexo CHAR(1) CHECK(sexo IN ('M'/'H')),
fecha_nacimiento DATE, 
cod_curso INT, 
FOREIGN KEY (cod_curso)
    REFERENCES cursos (cod_curso)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);