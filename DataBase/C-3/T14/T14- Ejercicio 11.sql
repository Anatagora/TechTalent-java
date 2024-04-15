CREATE DATABASE investigadores_db
USE investigadores_db;

CREATE TABLE facultad(
    cod_facultad INT, 
    nombre VARCHAR(100), 
    PRIMARY KEY(cod_facultad)
);

CREATE TABLE equipos(
    num_serie CHAR(4), 
    PRIMARY KEY (num_serie),
    nombre VARCHAR(100), 
    cod_facultad INT, 
    FOREIGN KEY (cod_facultad)
    REFERENCES facultad (cod_facultad)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);

CREATE TABLE investigadores(
    dni_investigador VARCHAR(8), 
    PRIMARY KEY (dni_investigador),
    nom_apels VARCHAR(255), 
    cod_facultad INT, 
    FOREIGN KEY (cod_facultad)
    REFERENCES facultad (cod_facultad)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);

CREATE TABLE reserva(
    comienzo DATE, 
    fin DATE, 
    dni_investigador VARCHAR(8), 
    num_serie CHAR(4), 
    PRIMARY KEY(dni_investigador, num_serie), 
     FOREIGN KEY (dni_investigador)
    REFERENCES investigadores (dni_investigador)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (num_serie)
    REFERENCES equipos (num_serie)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
); 