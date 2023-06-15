# Autor: ❤🚀❤ Vitor de Jesus ❤🚀❤
# Data: 15/06/2023 
# Titulo: Projeto model.Conexao com DB

CREATE DATABASE db_API_java;
USE `db_API_java`;

CREATE TABLE CLIENTE (
id int NOT NULL,
nome varchar (45) NOT NULL,
telefone int (11) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO CLIENTE (id, nome, telefone) values
('1', 'JOAO','11970707070');

