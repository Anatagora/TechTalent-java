INSERT INTO cientificos (dni_cientifico, nom_apels) VALUES
('12345678', 'García, Juan'),
('23456789', 'Martínez, María'),
('34567890', 'López, José'),
('45678901', 'Pérez, Ana'),
('56789012', 'Rodríguez, Carlos'),
('67890123', 'Sánchez, Laura'),
('78901234', 'González, Pedro'),
('89012345', 'Ramírez, Isabel'),
('90123456', 'Torres, Sergio'),
('01234567', 'Díaz, Carmen'); 

INSERT INTO proyecto (id_proyecto, nombre, horas) VALUES
('P004', 'Proyecto D', 45),
('P005', 'Proyecto E', 55),
('P006', 'Proyecto F', 35),
('P007', 'Proyecto G', 60),
('P008', 'Proyecto H', 40),
('P009', 'Proyecto I', 50),
('P010', 'Proyecto J', 30),
('P011', 'Proyecto K', 70),
('P012', 'Proyecto L', 25),
('P013', 'Proyecto M', 65);  

INSERT INTO asignado_a (dni_cientifico, id_proyecto) VALUES
('12345678', 'P004'),
('23456789', 'P004'),
('34567890', 'P005'),
('45678901', 'P005'),
('56789012', 'P006'),
('67890123', 'P006'),
('78901234', 'P007'),
('89012345', 'P007'),
('90123456', 'P008'),
('01234567', 'P008');