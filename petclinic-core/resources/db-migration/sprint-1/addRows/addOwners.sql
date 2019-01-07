--liquibase formatted sql

--changeset sylvain:7

USE petclinic;

INSERT INTO owners (firstname, lastname, address, city, telephone)
VALUES ("James", "James", "25 Street of pets","Petcity","0444444444");

INSERT INTO owners (firstname, lastname, address, city, telephone)
VALUES ("Sylvain", "Urbain", "25 Street of cats","Catcity","0444845434");

INSERT INTO owners (firstname, lastname, address, city, telephone)
VALUES ("Van", "Jackson", "25 Street of dogs","Dogcity","0444349444");