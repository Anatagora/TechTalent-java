CREATE DATABASE comercio_jalal 
USE comercio_jalal; 

CREATE TABLE proveedores(
    id_proveedor INT AUTO_INCREMENT, 
    PRIMARY KEY (id_proveedor), 
    nombre VARCHAR(200) NOT NULL
);

CREATE TABLE productos(
    id_producto CHAR(5), 
    PRIMARY KEY (id_producto), 
    nombre VARCHAR(80), 
    precio FLOAT(5,2), 
    IVA FLOAT(5,2) CHECK (IVA=0.04 OR IVA=0.21),
    id_proveedor INT, 
    FOREIGN KEY (id_proveedor) 
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT, 
    PRIMARY KEY (id_cliente),
    nombre VARCHAR(80), 
    apellidos VARCHAR (80),
    e_mail VARCHAR(150),
);