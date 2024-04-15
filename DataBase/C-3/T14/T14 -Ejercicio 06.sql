CREATE DATABASE peliculas_y_salas
USE peliculas_y_salas; 

CREATE TABLE peliculas(
cod_pelicula INT, 
nombre VARCHAR(100),
calificacion_edad INT, 
PRIMARY KEY (cod_pelicula)
); 

CREATE TABLE salas(
cod_sala INT, 
PRIMARY KEY (cod_sala), 
nombre VARCHAR(100), 
cod_pelicula INT, 
FOREIGN KEY (cod_pelicula)
    REFERENCES peliculas (cod_pelicula)
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);