--CONSULTAS 
-- 1. Obtener todos los proveedores y sus productos
SELECT p.nombre AS Proveedor, pr.nombre AS Producto
FROM proveedores p
JOIN productos pr ON p.id_proveedor = pr.id_proveedor; 

-- 2. Obtener la cantidad de inventario para cada producto
SELECT pr.nombre AS Producto, i.cantidad AS Cantidad
FROM inventario i
JOIN productos pr ON i.id_producto = pr.id_producto;

-- 3. Obtener el total de ventas por caja
SELECT c.num_caja, SUM(c.cantidad * c.precio_producto) AS Total_Venta
FROM caja c
GROUP BY c.num_caja;

-- 4. Obtener el nombre del cliente y el precio total del ticket
SELECT cl.nombre, t.precio_total
FROM clientes cl
JOIN ticket t ON cl.id_ticket = t.id_ticket;

-- 5. Obtener los productos con IVA del 21%
SELECT nombre, precio, IVA
FROM productos
WHERE IVA = 0.21;

-- UPDATE 

-- 1. Actualizar el precio de todos los productos con IVA del 21% a un nuevo valor
UPDATE productos
SET precio = precio * 1.10
WHERE IVA = 0.21;

-- 2. Actualizar el precio de un producto específico
UPDATE productos
SET precio = 1050.00
WHERE id_producto = '001';

-- 3. Actualizar el correo electrónico del cliente con id_cliente igual a 1
UPDATE clientes
SET e_mail = 'nuevo.correo@example.com'
WHERE id_cliente = 1;
 
 -- ELIMINICACIÓN 

-- 1. Eliminar un producto específico por su id_producto
DELETE FROM productos
WHERE id_producto = '005';

-- 2. Eliminar un cliente por correo electrónico
DELETE FROM clientes
WHERE e_mail = 'roberto.fernandez@example.com';

-- 3. Eliminar un cliente por su id_cliente
DELETE FROM clientes
WHERE id_cliente = 2;

8 -- Obtener todos los productos y la cantidad disponible en inventario (si está disponible)
SELECT pr.nombre AS Producto, i.cantidad AS Cantidad_Disponible
FROM productos pr
LEFT JOIN inventario i ON pr.id_producto = i.id_producto;

