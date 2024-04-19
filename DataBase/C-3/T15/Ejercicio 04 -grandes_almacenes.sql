INSERT INTO cajeros (cod_cajero, nom_apels) VALUES
(1, 'Juan Pérez'),
(2, 'María López'),
(3, 'Carlos Rodríguez'),
(4, 'Ana García'),
(5, 'Pedro Martínez'),
(6, 'Laura Sánchez'),
(7, 'José González'),
(8, 'Isabel Ramírez'),
(9, 'Sergio Torres'),
(10, 'Carmen Díaz'); 

INSERT INTO maquinas_registradoras (cod_maquina, piso) VALUES
(101, 1),
(102, 2),
(103, 1),
(104, 3),
(105, 2),
(106, 1),
(107, 3),
(108, 2),
(109, 1),
(110, 3); 

INSERT INTO productos (cod_producto, nombre, precio) VALUES
(501, 'Producto A', 100),
(502, 'Producto B', 150),
(503, 'Producto C', 200),
(504, 'Producto D', 120),
(505, 'Producto E', 180),
(506, 'Producto F', 90),
(507, 'Producto G', 210),
(508, 'Producto H', 160),
(509, 'Producto I', 220),
(510, 'Producto J', 130);

INSERT INTO venta (cod_cajero, cod_maquina, cod_producto) VALUES
(1, 101, 501),
(2, 102, 502),
(3, 103, 503),
(4, 104, 504),
(5, 105, 505),
(6, 106, 506),
(7, 107, 507),
(8, 108, 508),
(9, 109, 509),
(10, 110, 510);