CREATE DATABASE peluqueriadb;

USE peluqueriadb;

CREATE TABLE dueno(
	id_dueno int primary key auto_increment not null,
    nombre varchar(255) not null,
    celular varchar(255) not null
);

CREATE TABLE mascota(
	numero_cliente int primary key auto_increment not null,
    id_dueno int not null,
    nombre_perro varchar(255) not null,
    raza varchar(255) not null,
    color varchar(255) not null,
    alergico boolean not null,
    atencion_especial boolean not null,
    observacion varchar(255) not null
);

-- relacionar tablas
ALTER TABLE mascota ADD CONSTRAINT FK_mascotaDueno FOREIGN KEY (id_dueno) REFERENCES dueno(id_dueno);
