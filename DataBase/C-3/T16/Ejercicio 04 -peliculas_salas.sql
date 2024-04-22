USE peliculas_y_salas; 

INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES 
(101, 'Titanic', 12),
(102, 'El Padrino', 18),
(103, 'Pulp Fiction', 18),
(104, 'La La Land', 7),
(105, 'Inception', 12),
(106, 'The Shawshank Redemption', 16),
(107, 'Forrest Gump', 7),
(108, 'Matrix', 16),
(109, 'Fight Club', 18),
(110, 'Interstellar', 13);

INSERT INTO salas (nombre, cod_pelicula) VALUES 
('Sala 1', 101),
('Sala 2', 102),
('Sala 3', 103),
('Sala 4', 104),
('Sala 5', 105),
('Sala 6', 106),
('Sala 7', 107),
('Sala 8', 108),
('Sala 9', 109),
('Sala 10', 110);  

--CONSULTAS 
