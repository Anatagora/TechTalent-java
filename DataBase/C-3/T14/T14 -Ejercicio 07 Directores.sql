CREATE DATABASE directores_db
USE directores_db;

CREATE TABLE despachos(
    num_despacho INT, 
    capacidad INT, 
    PRIMARY KEY (num_despacho)
);

CREATE TABLE directores(
    dni VARCHAR(8), 
    PRIMARY KEY (dni), 
    nom_apels VARCHAR(255), 
    dni_jefe VARCHAR(8), 
    FOREIGN KEY (dni_jefe)
    REFERENCES directores (dni)
    ON DELETE CASCADE 
    ON UPDATE CASCADE, 
    num_despacho INT, 
    FOREIGN KEY (num_despacho)
    REFERENCES despachos (num_despacho)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);