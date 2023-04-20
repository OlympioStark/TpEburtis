package com.tpeburtis.TP1.application;

import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonVO;

import javax.swing.*;
import java.util.List;

public interface PersonService {

    Person create(PersonVO person);
    Person findById(Long idPers);
    List<Person> findAll();
    Person updatePers(Long idPers, PersonVO person);
    void deletePers(Long idPers);

}
