CREATE DATABASE grandes_almacenes
USE grandes_almacenes; 

CREATE TABLE cajeros(
    cod_cajero INT, 
    nom_apels VARCHAR(255), 
    PRIMARY KEY (cod_cajero)
);

CREATE TABLE maquinas_registradoras(
    cod_maquina INT, 
    piso INT, 
    PRIMARY KEY(cod_maquina)
);

CREATE TABLE productos(
    cod_producto INT, 
    nombre VARCHAR(100), 
    precio INT, 
    PRIMARY KEY(cod_producto)
);

CREATE TABLE venta(
    cod_cajero INT, 
    cod_maquina INT, 
    cod_producto INT, 
    PRIMARY KEY(cod_cajero, cod_maquina, cod_producto), 
    FOREIGN KEY (cod_cajero)
    REFERENCES cajeros (cod_cajero)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (cod_maquina)
    REFERENCES maquinas_registradoras (cod_maquina)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (cod_producto)
    REFERENCES productos (cod_producto)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
); 