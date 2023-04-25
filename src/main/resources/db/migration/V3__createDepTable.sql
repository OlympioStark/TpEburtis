CREATE TABLE departement (
    id_depart SERIAL NOT NULL,
    code_dep varchar(20) NOT NULL,
    designation varchar(100) NOT NULL,
    PRIMARY KEY (id_depart)
);