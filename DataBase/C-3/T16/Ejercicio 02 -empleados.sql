USE empleados_db; 

INSERT INTO departamentos (nombre, presupuesto) VALUES 
('Marketing', 10000),
('Finanzas', 12000),
('Recursos Humanos', 11000),
('Ventas', 13000),
('Tecnología', 10500),
('Logística', 12500),
('Soporte', 11500),
('Desarrollo', 13500),
('Calidad', 14000),
('Administración', 14500);

INSERT INTO empleados (dni, nombre, apellidos, cod_departamento) VALUES 
('11111111', 'María', 'González', 1),
('22222222', 'Carlos', 'Ruiz', 2),
('33333333', 'Laura', 'Pérez', 3),
('44444444', 'Pedro', 'Sánchez', 4),
('55555555', 'Ana', 'López', 5),
('66666666', 'Javier', 'García', 6),
('77777777', 'Isabel', 'Martínez', 7),
('88888888', 'Sergio', 'Fernández', 8),
('99999999', 'Elena', 'Díaz', 9),
('10101010', 'Ricardo', 'Torres', 10);

--CONSULTAS 
--1 Obtener los apellidos de los empleados
SELECT apellidos FROM empleados;

--2 Obtener los apellidos de los empleados sin repeticiones
SELECT DISTINCT apellidos FROM empleados;

--3 Obtener todos los datos de los empleados que se apellidan 'López'
SELECT * FROM empleados WHERE apellidos = 'López';

--4 Obtener todos los datos de los empleados que se apellidan 'López' y 'Pérez'
SELECT * FROM empleados WHERE apellidos IN ('López', 'Pérez');

--5 Obtener todos los datos de los empleados que trabajan para el departamento 4
SELECT * FROM empleados WHERE cod_departamento = 4;

--6 Obtener todos los datos de los empleados que trabajan para el departamento 3 y para el departamento 7
SELECT * FROM empleados WHERE cod_departamento IN (3, 7);

--7 Obtener todos los datos de los empleados cuyo apellido comience por P
SELECT * FROM empleados WHERE apellidos LIKE 'P%';

--8 Obtener el presupuesto total de todos los departamentos
SELECT SUM(presupuesto) AS presupuesto_total FROM departamentos;

--9 Obtener el número de empleados en cada departamento
SELECT cod_departamento, COUNT(*) AS numero_empleados FROM empleados GROUP BY cod_departamento;

--10 Obtener un listado completo de empleados, incluyendo por cada empleado los datos del empleado y de su departamento
SELECT e.*, d.nombre AS nombre_departamento, d.presupuesto 
FROM empleados AS e 
JOIN departamentos AS d ON e.cod_departamento = d.cod_departamento;

--11 Obtener un listado completo de empleados, incluyendo el nombre y apellidos del empleado junto al nombre y presupuesto de su departamento
SELECT e.nombre, e.apellidos, d.nombre AS nombre_departamento, d.presupuesto 
FROM empleados AS e 
JOIN departamentos AS d ON e.cod_departamento = d.cod_departamento;

--12 Obtener los nombres y apellidos de los empleados que trabajen en departamentos cuyo presupuesto sea mayor a 12.000€
SELECT e.nombre, e.apellidos 
FROM empleados AS e 
JOIN departamentos AS d ON e.cod_departamento = d.cod_departamento 
WHERE d.presupuesto > 12000;

--13 Obtener los datos de los departamentos cuyo presupuesto es superior al presupuesto medio de todos los departamentos
SELECT * 
FROM departamentos 
WHERE presupuesto > (SELECT AVG(presupuesto) FROM departamentos);

--14 Obtener los nombres (únicamente los nombres) de los departamentos que tienen más de 2 empleados
SELECT d.nombre 
FROM empleados AS e 
JOIN departamentos AS d ON e.cod_departamento = d.cod_departamento 
GROUP BY d.nombre 
HAVING COUNT(*) > 2;

--15 Añadir un nuevo departamento: 'Nueva_Calidad', con presupuesto de 40.000€ y código 11
INSERT INTO departamentos (cod_departamento, nombre, presupuesto) VALUES (11, 'Nueva_Calidad', 40000);

--16 Añadir un empleado vinculado al departamento recién creado: Esther Vázquez, DNI 89267109
INSERT INTO empleados (dni, nombre, apellidos, cod_departamento) VALUES ('89267109', 'Esther', 'Vázquez', 9);

--17 Aplicar un recorte presupuestario del 10% a todos los departamentos
UPDATE departamentos SET presupuesto = presupuesto * 0.9;

--18 Reasignar a los empleados del departamento Administración (código 10) al departamento Tecnología (código 5)
UPDATE empleados SET cod_departamento = 5 WHERE cod_departamento = 10;

--19 Despedir a todos los empleados que trabajan para el departamento de Tecnología (código 5)
DELETE FROM empleados WHERE cod_departamento = 5;

--20 Despedir a todos los empleados que trabajen para departamentos cuyo presupuesto sea superior a los 15.000€
DELETE FROM empleados WHERE cod_departamento IN (SELECT cod_departamento FROM departamentos WHERE presupuesto > 15000);

--21 Despedir a todos los empleados
DELETE FROM empleados;