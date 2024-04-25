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
-- Mostrar el nombre de todas las películas
SELECT nombre FROM peliculas;

-- Mostrar las distintas calificaciones de edad que existen
SELECT DISTINCT calificacion_edad FROM peliculas;

-- Mostrar todas las películas que no han sido calificadas
SELECT nombre FROM peliculas WHERE calificacion_edad IS NULL;

-- Mostrar todas las salas que no proyectan ninguna película
SELECT s.nombre AS nombre_sala
FROM salas AS s
LEFT JOIN peliculas AS p ON s.cod_pelicula = p.cod_pelicula
WHERE p.cod_pelicula IS NULL;

-- Mostrar la información de todas las salas y, si se proyecta alguna película en la sala, mostrar también la información de la película
SELECT s.nombre AS nombre_sala, p.nombre AS nombre_pelicula, p.calificacion_edad
FROM salas AS s
LEFT JOIN peliculas AS p ON s.cod_pelicula = p.cod_pelicula;

-- Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala
SELECT p.nombre AS nombre_pelicula, s.nombre AS nombre_sala
FROM peliculas AS p
LEFT JOIN salas AS s ON p.cod_pelicula = s.cod_pelicula;

-- Mostrar los nombres de las películas que no se proyectan en ninguna sala
SELECT p.nombre
FROM peliculas AS p
LEFT JOIN salas AS s ON p.cod_pelicula = s.cod_pelicula
WHERE s.cod_pelicula IS NULL;

-- Añadir una película 'Uno, dos, tres', para mayores de 7 años
INSERT INTO peliculas (cod_pelicula, nombre, calificacion_edad) VALUES (111, 'Uno, dos, tres', 7);

-- Hacer constar que todas las películas no calificadas han sido calificadas 'no recomendables para menores de 13 años'
UPDATE peliculas SET calificacion_edad = 13 WHERE calificacion_edad IS NULL;

-- Eliminar todas las salas que proyectan películas recomendadas para todos los públicos
DELETE FROM salas WHERE cod_pelicula IN (SELECT cod_pelicula FROM peliculas WHERE calificacion_edad <= 7);
