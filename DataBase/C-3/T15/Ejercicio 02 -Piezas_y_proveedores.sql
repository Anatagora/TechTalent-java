INSERT INTO piezas (nombre) VALUES
('tornillo'),('muelle'),('destornillador'),('tuerca'),('arandela'),('perno'),('remache'),('resorte'),('abrazadera'),('brida'); 

INSERT INTO proveedores (id_proveedor, nombre) VALUES
('1111', 'Paco'), ('1112', 'Jysk'),
('1113', 'Leroy_Merlin'), ('1114', 'Bauhaus'), 
('1115', 'Muebles_Ardilla'), ('1116', 'Bricomat'),  
('1117', 'Ikea'), ('1118', 'Mercadona'), 
('1119', 'Aldi'), ('1121', 'Carrefour');

INSERT INTO suministra (cod_pieza, id_proveedor,precio) VALUES
(1, "1111", 2), (2, "1112", 5),  
(3, "1113", 1),  (4, "1114", 4),
(5, "1115", 9),  (6, "1116", 3),
(7, "1117", 8),  (8, "1118", 2),
(9, "1119", 15),  (10, "1121", 2);  

INSERT INTO suministra (precio) VALUES 
(1,2,2,3,1,5,8,4,6,3); 