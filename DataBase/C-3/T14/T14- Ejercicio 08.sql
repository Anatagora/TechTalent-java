CREATE DATABASE piezas_proveedores
USE piezas_proveedores;

CREATE TABLE piezas(
    cod_pieza INT, 
    nombre VARCHAR(100), 
    PRIMARY KEY(cod_pieza)
);

CREATE TABLE proveedores(
    id_proveedor CHAR(4), 
    nombre VARCHAR(100),
    PRIMARY KEY (id_proveedor)
);

CREATE TABLE suministra(
    precio INT, 
    cod_pieza INT,  
    id_proveedor CHAR(4), 
    PRIMARY KEY (cod_pieza, id_proveedor),
     FOREIGN KEY (cod_pieza)
    REFERENCES piezas (cod_pieza)
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    FOREIGN KEY (id_proveedor)
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);