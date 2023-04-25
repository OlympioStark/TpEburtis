package com.tpeburtis.TP1.domain.person;

import com.tpeburtis.TP1.domain.departement.Department;
import jakarta.persistence.*;

@Entity
@Table(name ="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPerson;
    private String lastName;
    private String firstName;
    private int age;

    public Person() {}

    public Person(PersonVO person) {
        this.lastName = person.getLastName();
        this.firstName = person.getFirstName();
        this.age = person.getAge();
    }

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*public Department getDepartements() {
        return departements;
    }

    public void setDepartements(Department departements) {
        this.departements = departements;
    }

    @ManyToOne
    @MapsId("idDep")
    @JoinColumn(name="id_depart")
    private Department departements;*/
}

