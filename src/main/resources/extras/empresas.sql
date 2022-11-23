CREATE DATABASE empresas;
USE empresas;
CREATE TABLE empresa(
	id INT NOT NULL primary KEY,
    name VARCHAR(20),
    NIT VARCHAR(14) NOT NULL,
    fundation varchar(10),
    address varchar(50)
); 

INSERT INTO empresa(id, name, NIT, fundation, address) VALUES(1,"Diana","1234-123456","02/02/2000","Col. Escalon, Plaza #24");