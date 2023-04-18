package com.tpeburtis.TP1.application;

import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonVO;

import javax.swing.*;
import java.util.List;

public interface PersonService {

    PersonVO save(PersonVO person);

    PersonVO findById(Long idPers);

    List<PersonVO> findAll();
    Person updatePerson(Long IdPers);
    void deletePers(Long idPers);

}
