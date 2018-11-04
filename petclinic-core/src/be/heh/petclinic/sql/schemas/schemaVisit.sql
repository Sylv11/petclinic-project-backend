USE petclinic;

DROP TABLE IF EXISTS visits;
CREATE TABLE visits (
    id int NOT NULL AUTO_INCREMENT,
    petId int not null,
    date varchar(45) not null,
    description varchar(200) not null,
    primary key (id) );