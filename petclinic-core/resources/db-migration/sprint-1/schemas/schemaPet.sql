--liquibase formatted sql

--changeset sylvain:4

USE petclinic;

DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
    id int NOT NULL AUTO_INCREMENT,
    ownerId int not null,
    name varchar(45) not null,
    dateBirth varchar(80) not null,
    type varchar(45) not null,
    primary key (id) );