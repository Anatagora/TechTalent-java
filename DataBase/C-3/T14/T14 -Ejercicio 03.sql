CREATE DATABASE tienda_informatica 
USE tienda_informatica; 

CREATE TABLE fabricantes (
cod_fabricantes INT, 
nombre VARCHAR(100),
PRIMARY KEY (cod_fabricantes)
);

CREATE TABLE articulos(
cod_articulos INT, 
PRIMARY KEY (cod_articulos),
nombre VARCHAR(100), 
precio INT,
cod_fabricantes INT, 
FOREIGN KEY (cod_fabricantes)
    REFERENCES fabricantes (cod_fabricantes)
    ON DELETE SET NULL  
    ON UPDATE CASCADE
);