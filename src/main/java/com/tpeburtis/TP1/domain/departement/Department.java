package com.tpeburtis.TP1.domain.departement;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tpeburtis.TP1.domain.person.Person;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDep;
    private String codeDep;
    private String designation;

    public Department() {
    }

    public long getIdDep() {
        return idDep;
    }

    public void setIdDep(long idDep) {
        this.idDep = idDep;
    }

    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String codeDep) {
        this.codeDep = codeDep;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /*public List<Person> getPersonDep() {
        return personDep;
    }

    public void setPersonDep(List<Person> personDep) {
        this.personDep = personDep;
    }

    @OneToMany(mappedBy = "departements")
    @JsonIgnore
    private List<Person> personDep;*/
}
