CREATE DATABASE BD_DulceHogar;

USE BD_DulceHogar;

CREATE TABLE cliente(
	numero_socio INT PRIMARY KEY,
	rut INT NOT NULL,
	nombre VARCHAR(60),
	apellido_paterno VARCHAR(60),
	apellido_materno VARCHAR(60),
	correo VARCHAR(60),
	domicilio VARCHAR(60),
	region VARCHAR(60),
	ciudad VARCHAR(60),
	comuna VARCHAR(60),
	telefono VARCHAR(10)
);

CREATE TABLE cuenta (
    numero_socio INT,
    valor_cuota DECIMAL(10, 2),
    cantidad_aportada DECIMAL(10, 2),
    FOREIGN KEY (numero_socio) REFERENCES socio(numero_socio)
);

commit;