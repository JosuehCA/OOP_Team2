-- -----------------------------------------------------
-- Schema RFID
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `RFID` DEFAULT CHARACTER SET utf8 ;
USE `RFID` ;

-- -----------------------------------------------------
-- Table `RFID`.`datos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `RFID`.`datos` (
  id INT PRIMARY KEY,
  nombre VARCHAR(255),
  fechaderegistro DATE
  PRIMARY KEY (`id`))
ENGINE = "";
