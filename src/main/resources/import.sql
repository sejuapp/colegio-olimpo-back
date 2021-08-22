INSERT INTO colegio (id, nombre) VALUES(1, 'El colegio del Olimpo');

INSERT INTO curso (id, grado, salon, colegio_id) VALUES(1, 10, 'A', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES(2, 10, 'B', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES(3, 11, 'A', 1);
INSERT INTO curso (id, grado, salon, colegio_id) VALUES(4, 11, 'B', 1);

INSERT INTO profesor (id, nombre) VALUES(1, 'Némesis');
INSERT INTO profesor (id, nombre) VALUES(2, 'Príapo');
INSERT INTO profesor (id, nombre) VALUES(3, 'Iris');

INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(1, 1, 'Matemáticas', 1);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(2, 1, 'Matemáticas', 2);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(3, 1, 'Matemáticas', 3);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(4, 1, 'Matemáticas', 4);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(5, 2, 'Español', 1);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(6, 2, 'Español', 2);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(7, 3, 'Ingles básico', 1);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(8, 3, 'Ingles avanzado', 2);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(9, 1, 'Pre Icfes', 3);
INSERT INTO asignatura (id, profesor_id, nombre, curso_id) VALUES(10, 1, 'Pre Icfes', 4);

INSERT INTO estudiante (id, nombre) VALUES(1, 'Afrodita');
INSERT INTO estudiante (id, nombre) VALUES(2, 'Apolo');
INSERT INTO estudiante (id, nombre) VALUES(3, 'Ares');
INSERT INTO estudiante (id, nombre) VALUES(4, 'Artemisa');
INSERT INTO estudiante (id, nombre) VALUES(5, 'Atenea');
INSERT INTO estudiante (id, nombre) VALUES(6, 'Dionisio');
INSERT INTO estudiante (id, nombre) VALUES(7, 'Hefesto');
INSERT INTO estudiante (id, nombre) VALUES(8, 'Hera');
INSERT INTO estudiante (id, nombre) VALUES(9, 'Hermes');
INSERT INTO estudiante (id, nombre) VALUES(10, 'Hades');
INSERT INTO estudiante (id, nombre) VALUES(11, 'Poseidón');
INSERT INTO estudiante (id, nombre) VALUES(12, 'Zeus');

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(1, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(1, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(1, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles básico' and concat(c.grado, c.salon)  =  '10A' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(2, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(2, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(2, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles básico' and concat(c.grado, c.salon)  =  '10A' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(3, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(3, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(3, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles básico' and concat(c.grado, c.salon)  =  '10A' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(4, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(4, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(4, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles avanzado' and concat(c.grado, c.salon)  =  '10B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(5, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(5, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(5, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles avanzado' and concat(c.grado, c.salon)  =  '10B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(6, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(6, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Español' and concat(c.grado, c.salon)  =  '10B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(6, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Ingles avanzado' and concat(c.grado, c.salon)  =  '10B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(7, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(7, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11A' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(8, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11A' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(8, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11A' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(9, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(9, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(10, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(10, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(11, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(11, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11B' limit 1));

INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(12, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Matemáticas' and concat(c.grado, c.salon)  =  '11B' limit 1));
INSERT INTO asignatura_estudiante (estudiante_id, asignatura_id) VALUES(12, (SELECT a.id FROM ASIGNATURA  a LEFT JOIN curso c ON c.id = a.curso_id  where a.nombre = 'Pre Icfes' and concat(c.grado, c.salon)  =  '11B' limit 1));
