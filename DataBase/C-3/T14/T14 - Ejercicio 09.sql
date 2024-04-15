CREATE DATABASE cientificos_db
USE cientificos_db; 

CREATE TABLE cientificos(
    dni_cientifico VARCHAR(8), 
    nom_apels VARCHAR(255), 
    PRIMARY KEY (dni_cientifico)
);

CREATE TABLE proyecto(
    id_proyecto CHAR(4), 
    nombre VARCHAR(255),
    horas INT, 
    PRIMARY KEY(id_proyecto)
);

CREATE TABLE asignado_a(
dni_cientifico VARCHAR(8), 
id_proyecto CHAR(4), 
PRIMARY KEY (dni_cientifico, id_proyecto),
FOREIGN KEY (dni_cientifico)
    REFERENCES cientificos (dni_cientifico)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
FOREIGN KEY (id_proyecto)
    REFERENCES proyecto (id_proyecto)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);