USE almacenes_db; 

INSERT INTO almacenes (lugar, capacidad) VALUES 
('Madrid', 1000),
('Barcelona', 1200),
('Valencia', 1100),
('Sevilla', 1300),
('Zaragoza', 1050),
('Málaga', 1250),
('Murcia', 1150),
('Palma de Mallorca', 1350),
('Las Palmas de Gran Canaria', 1400),
('Bilbao', 1450); 

INSERT INTO cajas (num_referencia, contenido, valor, cod_almacen) VALUES 
('C001', 'Libro', 50, 11),
('C002', 'Portátil', 70, 12),
('C003', 'Cámara', 60, 13),
('C004', 'Gafas de sol', 80, 14),
('C005', 'Reloj', 65, 15),
('C006', 'Teléfono móvil', 55, 16),
('C007', 'Joyas', 75, 17),
('C008', 'Tableta', 85, 18),
('C009', 'Ropa', 90, 19),
('C010', 'Zapatos', 95, 20);

--CONSULTAS 
-- 1) Obtener todos los almacenes
SELECT * FROM almacenes;

-- 2) Obtener todas las cajas cuyo contenido tenga un valor superior a 150
SELECT * FROM cajas WHERE valor > 150;

-- 3) Obtener los tipos de contenidos de las cajas
SELECT DISTINCT contenido FROM cajas;

-- 4) Obtener el valor medio de todas las cajas
SELECT AVG(valor) AS valor_medio FROM cajas;

-- 5) Obtener el valor medio de las cajas de cada almacén
SELECT cod_almacen, AVG(valor) AS valor_medio
FROM cajas
GROUP BY cod_almacen;

-- 6) Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150
SELECT cod_almacen
FROM cajas
GROUP BY cod_almacen
HAVING AVG(valor) > 150;

-- 7) Obtener el numero de referencia de cada caja junto con el nombre de la ciudad (lugar) en la que se encuentra
SELECT c.num_referencia, a.lugar
FROM cajas AS c
INNER JOIN almacenes AS a ON c.cod_almacen = a.cod_almacen;

-- 8) Obtener el numero de cajas que hay en cada almacén
SELECT cod_almacen, COUNT(*) AS num_cajas
FROM cajas
GROUP BY cod_almacen;

-- 9) Obtener los códigos de los almacenes que están saturados (numero de cajas > capacidad)
SELECT cod_almacen
FROM almacenes
WHERE (SELECT COUNT(*) FROM cajas WHERE cajas.cod_almacen = almacenes.cod_almacen) > capacidad;

-- 10) Obtener los numeros de referencia de las cajas que están en Bilbao
SELECT num_referencia
FROM cajas
INNER JOIN almacenes ON cajas.cod_almacen = almacenes.cod_almacen
WHERE lugar = 'Bilbao';

-- 11) Insertar un nuevo almacén (lugar = Barcelona) con capacidad para 3 cajas
INSERT INTO almacenes (lugar, capacidad) VALUES ('Barcelona', 3);

-- 12) Insertar una nueva caja, con numero de referencia H5RT con contenido Papel, valor 200 y situada en el almacén 2
INSERT INTO cajas (num_referencia, contenido, valor, cod_almacen) VALUES ('H5RT', 'Papel', 200, 2);

-- 13) Rebajar el valor de todas las cajas un 15%
UPDATE cajas SET valor = valor * 0.85;

-- 14) Rebajar un 20% el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas
UPDATE cajas SET valor = valor * 0.8 WHERE valor > (SELECT AVG(valor) FROM cajas);

-- 15) Eliminar todas las cajas cuyo valor sea inferior a 100
DELETE FROM cajas WHERE valor < 100;

-- 16) Vaciar el contenido de los almacenes que están saturados
UPDATE cajas SET contenido = NULL WHERE cod_almacen IN (SELECT cod_almacen FROM almacenes WHERE (SELECT COUNT(*) FROM cajas WHERE cajas.cod_almacen = almacenes.cod_almacen) > capacidad)