ALTER TABLE person add column personDep int;

ALTER TABLE person add constraint add_forkey FOREIGN KEY (personDep) REFERENCES departement (id_depart);