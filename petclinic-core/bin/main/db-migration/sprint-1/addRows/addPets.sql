--liquibase formatted sql

--changeset sylvain:8

USE petclinic;

INSERT INTO pets (ownerId, name, dateBirth, type)
VALUES (1, "Eugene", "23-12-1998", "hamster");

INSERT INTO pets (ownerId, name, dateBirth, type)
VALUES (1, "Rox", "17-10-2002", "fox");

INSERT INTO pets (ownerId, name, dateBirth, type)
VALUES (2, "Patate", "15-02-2000", "dog");