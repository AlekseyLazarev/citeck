CREATE DATABASE IF NOT EXISTS testDB;
USE testDB; 
DROP TABLE IF EXISTS numbers;
CREATE TABLE numbers(digit INT);
INSERT numbers VALUES ('1'), ('2'), ('4'), ('7'), ('8'), ('11');