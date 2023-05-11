CREATE TABLE topicos2 (
  id INT NOT NULL AUTO_INCREMENT,
  titulo VARCHAR(255) NOT NULL,
  mensaje TEXT NOT NULL,
  autor VARCHAR(255) NOT NULL,
  curso VARCHAR(255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (titulo, mensaje)
);
