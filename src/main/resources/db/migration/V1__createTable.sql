CREATE TABLE person (
    id_person SERIAL NOT NULL,
    last_name varchar(30) NOT NULL,
    first_name varchar(50) NOT NULL,
    age int NOT NULL,
    PRIMARY KEY (id_person)
);