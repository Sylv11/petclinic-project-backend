--liquibase formatted sql

--changeset sylvain:2

USE petclinic;

DROP TABLE IF EXISTS vets;
CREATE TABLE vets (
    id int NOT NULL AUTO_INCREMENT,
    lastname varchar(45) not null,
    firstname varchar(45) not null,
    speciality varchar(45) not null,
    primary key (id) );