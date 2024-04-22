USE almacenes_db; 

INSERT INTO almacenes (lugar, capacidad) VALUES 
('Lugar A', 1000),
('Lugar B', 1200),
('Lugar C', 1100),
('Lugar D', 1300),
('Lugar E', 1050),
('Lugar F', 1250),
('Lugar G', 1150),
('Lugar H', 1350),
('Lugar I', 1400),
('Lugar J', 1450); 

INSERT INTO cajas (num_referencia, contenido, valor, cod_almacen) VALUES 
('C001', 'Contenido1', 50, 1),
('C002', 'Contenido2', 70, 2),
('C003', 'Contenido3', 60, 3),
('C004', 'Contenido4', 80, 4),
('C005', 'Contenido5', 65, 5),
('C006', 'Contenido6', 55, 6),
('C007', 'Contenido7', 75, 7),
('C008', 'Contenido8', 85, 8),
('C009', 'Contenido9', 90, 9),
('C010', 'Contenido10', 95, 10);