package com.tpeburtis.TP1.domain.person;

import com.tpeburtis.TP1.domain.departement.Department;
import lombok.Builder;

@Builder
public class PersonVO {

    private long idPerson;
    private String lastName;
    private String firstName;
    private int age;
    /*private Department departements;*/

    public PersonVO(long idPerson, String lastName, String firstName, int age) {
        this.idPerson = idPerson;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        /*this.departements = departements;*/
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
    }*/

    public static PersonVO fromEntity(Person person) {
        if (person == null) {
            return null;
        }
        return PersonVO.builder()
                .idPerson(person.getIdPerson())
                .lastName(person.getLastName())
                .firstName(person.getFirstName())
                .age(person.getAge())
                /*.departements(person.getDepartements())*/
                .build();
    }

    public static Person toEntity(PersonVO personVO) {
        if (personVO == null) {
            return null;
        }
        Person person = new Person(personVO);
        person.setIdPerson(personVO.getIdPerson());
        person.setLastName(personVO.getLastName());
        person.setFirstName(personVO.getFirstName());
        person.setAge(personVO.getAge());
       /* person.setDepartements(personVO.getDepartements());*/
        return person;
    }

}
