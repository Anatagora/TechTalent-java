INSERT INTO facultad (cod_facultad, nombre) VALUES
(1, 'Facultad de Ciencias'),
(2, 'Facultad de Ingeniería'),
(3, 'Facultad de Medicina'),
(4, 'Facultad de Derecho'),
(5, 'Facultad de Artes'),
(6, 'Facultad de Economía'),
(7, 'Facultad de Humanidades'),
(8, 'Facultad de Educación'),
(9, 'Facultad de Arquitectura'),
(10, 'Facultad de Química');

INSERT INTO equipos (num_serie, nombre, cod_facultad) VALUES
('E001', 'Equipo A', 1),
('E002', 'Equipo B', 2),
('E003', 'Equipo C', 3),
('E004', 'Equipo D', 4),
('E005', 'Equipo E', 5),
('E006', 'Equipo F', 6),
('E007', 'Equipo G', 7),
('E008', 'Equipo H', 8),
('E009', 'Equipo I', 9),
('E010', 'Equipo J', 10);

INSERT INTO investigadores (dni_investigador, nom_apels, cod_facultad) VALUES
('12345678', 'Juan Pérez', 1),
('23456789', 'María López', 2),
('34567890', 'Carlos Rodríguez', 3),
('45678901', 'Ana García', 4),
('56789012', 'Pedro Martínez', 5),
('67890123', 'Laura Sánchez', 6),
('78901234', 'José González', 7),
('89012345', 'Isabel Ramírez', 8),
('90123456', 'Sergio Torres', 9),
('01234567', 'Carmen Díaz', 10);

INSERT INTO reserva (comienzo, fin, dni_investigador, num_serie) VALUES
('2024-05-01', '2024-05-15', '12345678', 'E001'),
('2024-05-02', '2024-05-16', '23456789', 'E002'),
('2024-05-03', '2024-05-17', '34567890', 'E003'),
('2024-05-04', '2024-05-18', '45678901', 'E004'),
('2024-05-05', '2024-05-19', '56789012', 'E005'),
('2024-05-06', '2024-05-20', '67890123', 'E006'),
('2024-05-07', '2024-05-21', '78901234', 'E007'),
('2024-05-08', '2024-05-22', '89012345', 'E008'),
('2024-05-09', '2024-05-23', '90123456', 'E009'),
('2024-05-10', '2024-05-24', '01234567', 'E010');
