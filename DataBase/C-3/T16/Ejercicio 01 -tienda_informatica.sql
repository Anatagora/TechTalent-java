USE tienda_informatica; 

INSERT INTO fabricantes (nombre) VALUES
('Fabricante A'), ('Fabricante B'), ('Fabricante C'), ('Fabricante D'), ('Fabricante E'), ('Fabricante F'), ('Fabricante G'), ('Fabricante H'), ('Fabricante I'), ('Fabricante J');  

INSERT INTO articulos (cod_articulos, nombre, precio, cod_fabricantes) VALUES 
(1, 'Artículo 1', 100, 1),
(2, 'Artículo 2', 200, 2),
(3, 'Artículo 3', 150, 3),
(4, 'Artículo 4', 300, 4),
(5, 'Artículo 5', 250, 5),
(6, 'Artículo 6', 120, 6),
(7, 'Artículo 7', 220, 7),
(8, 'Artículo 8', 180, 8),
(9, 'Artículo 9', 270, 9),
(10, 'Artículo 10', 350, 10);

-- CONSULTAS
--obtener los nombres de los productos de la tienda. 
SELECT nombre FROM articulos; 

--obtener los nombres y los precios de los productos de la tienda. 
SELECT nombre, precio FROM articulos;

--obtener el nombre de los productos cuyo precio sea menor o igual a 200€
SELECT nombre 
FROM articulos 
WHERE precio <= 200; 

--obtener todos los datos de los artículos cuyo precio esté entre los 60€ y los 120€ (ambas cantidades incluidas )
SELECT * 
FROM articulos 
WHERE precio BETWEEN 60 AND 120;

-- obtener el nombre y el precio en pesetas (es decir, el precio en euros multiplicado por 166.386)
SELECT nombre, precio * 166.386 AS precio_pesetas
FROM articulos;

--  seleccionar el precio medio de todos los productos 
SELECT AVG(precio) AS precio_medio
FROM articulos;

-- obtener el precio medio de los artículos cuyo fabricante sea 2
SELECT AVG(precio) AS precio_medio_fabricante_2
FROM articulos
WHERE cod_fabricantes = 2;  

-- Obtener el numero de artículos cuyo precio sea mayor o igual a 180€.  
SELECT COUNT(*) AS numero_articulos
FROM articulos
WHERE precio >= 180;

--Obtener el nombre y precio de los artículos cuyo precio sea mayor o igual a 180€ y ordenarlos descendentemente por precio, y luego ascendentemente por nombre.   
SELECT nombre, precio
FROM articulos
WHERE precio >= 180
ORDER BY precio DESC, nombre ASC;

-- Obtener un listado completo de artículos, incluyendo por cada articulo los datos del articulo y de su fabricante.  
SELECT a.*, f.nombre AS nombre_fabricante
FROM articulos AS a
JOIN fabricantes AS f ON a.cod_fabricantes = f.cod_fabricantes;

--Obtener un listado de artículos, incluyendo el nombre del artículo, su precio, y el nombre de su fabricante. 
SELECT a.nombre AS nombre_articulo, a.precio, f.nombre AS nombre_fabricante
FROM articulos AS a
JOIN fabricantes AS f ON a.cod_fabricantes = f.cod_fabricantes;

-- Obtener el precio medio de los producyos de cada fabricante, mostrando solo los códigos de fabricante.   
SELECT cod_fabricantes, AVG(precio) AS precio_medio
FROM articulos
GROUP BY cod_fabricantes;

--Obtener el precio medio de los productos de cada fabricante, mostrando el nombre del fabricante. 
SELECT f.nombre AS nombre_fabricante, AVG(a.precio) AS precio_medio
FROM articulos AS a
JOIN fabricantes AS f ON a.cod_fabricantes = f.cod_fabricantes
GROUP BY f.nombre;

-- Obtener los nombres de los fabricantes que ofrezcan productos cuyo precio medio sea mayor o igual a 150€. 
SELECT f.nombre
FROM articulos AS a
JOIN fabricantes AS f ON a.cod_fabricantes = f.cod_fabricantes
GROUP BY f.nombre
HAVING AVG(a.precio) >= 150;

--Obtener el nombre y precio del artículo más barato.   
SELECT nombre, precio
FROM articulos
ORDER BY precio ASC
LIMIT 1;

-- Obtener una lista con el nombre y precio de los artículos más caros de cada proveedor (incluyendo el nombre del proveedor).  
SELECT f.nombre AS nombre_fabricante, a.nombre AS nombre_articulo, a.precio
FROM (
    SELECT cod_fabricantes, MAX(precio) AS precio_maximo
    FROM articulos
    GROUP BY cod_fabricantes
) AS sub
JOIN articulos AS a ON sub.cod_fabricantes = a.cod_fabricantes AND sub.precio_maximo = a.precio
JOIN fabricantes AS f ON a.cod_fabricantes = f.cod_fabricantes;

-- Añadir un nuevo producto: Altavoces de 70€ (del fabricante 2). 
INSERT INTO articulos (nombre, precio, cod_fabricantes)
VALUES ('Altavoces', 70, 2);

--Cambiar el nombre del producto 8 a 'Impresora Laser'. 
UPDATE articulos
SET nombre = 'Impresora Laser'
WHERE cod_articulos = 8;

--  Aplicar un descuento del 10% (multiplicar el precio por 0.9) a todos los productos. 
UPDATE articulos
SET precio = precio * 0.9;

-- Aplicar un descuento de 10€ a todos los productos cuyo precio sea meyor o igual a 120€. 
UPDATE articulos
SET precio = precio - 10
WHERE precio >= 120;
