create database db_test;

use db_test;

-- Crea una tabla llamada "tu_tabla" con las columnas "name," "RFID," y "peso"
CREATE TABLE tableTest (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    RFID BIGINT NOT NULL,
    weight DECIMAL(10, 2) NOT NULL
);
show tables;

INSERT INTO tableTest (id, name, rfid, weight) VALUES (7, 'Corvina', '529', 23.9);

select * from tableTest;