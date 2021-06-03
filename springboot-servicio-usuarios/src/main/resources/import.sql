INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('rubexsd', '$2a$10$y17Yd07ywrgYHPpNR1qSLOKAjt35NDWldXqMTEikXSJyCoQ6uwes6', 1, 'ruben', 'catalan', 'rubexsd17@live.com.mx' );
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('samx', '$2a$10$uEOKW.EOHBYmRP/WYt77POVcqSp9PIuAASHgHpW/2/BcdS48XKxU2', 1, 'samuel', 'rivera', 'samx@live.com.mx' );
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('sara', '$2a$10$XHZj0yHmfN5RuYiS2AZ3.Ol2434nvJJ8QgRIor3pftiOo4dYymY72', 1, 'sarai', 'chavelas', 'sara@live.com.mx' );

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(3,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(3,2);