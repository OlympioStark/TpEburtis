package com.tpeburtis.TP1.domain.departement;

import com.tpeburtis.TP1.domain.person.Person;
import lombok.Builder;

import java.util.List;

@Builder
public class DepartmentVO {

    private long idDep;
    private String codeDep;
    private String designation;
    /*private List<Person> personDep;

    public List<Person> getPersonDep() {
        return personDep;
    }*/

    public DepartmentVO(long idDep, String codeDep, String designation) {
        this.idDep = idDep;
        this.codeDep = codeDep;
        this.designation = designation;
        /*this.personDep = personDep;*/
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
}
