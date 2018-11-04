USE petclinic;

DROP TABLE IF EXISTS owners;
CREATE TABLE owners (
    id int NOT NULL AUTO_INCREMENT,
    firstname varchar(45) not null,
    lastname varchar(45) not null,
    address varchar(80) not null,
    city varchar(45) not null,
    telephone varchar(20) not null,
    primary key (id) );
