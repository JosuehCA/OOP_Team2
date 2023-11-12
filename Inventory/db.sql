-- Crea una base de datos llamada 'product_db', en caso de no existir
CREATE DATABASE IF NOT EXISTS product_db;
-- Usa la base de datos recién creada
USE product_db;
-- Crea una tabla llamada "table_inventory" con las columnas "name," "RFID," y "peso", en caso de no existir
CREATE TABLE IF NOT EXISTS table_inventory (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    RFID BIGINT NOT NULL,
    weight DECIMAL(10, 2) NOT NULL
);

SHOW tables;    -- Muestra las tablas

SELECT * FROM table_inventory;  -- Muestra los valores dentro de la tabla 'table_inventory'