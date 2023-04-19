package com.tpeburtis.TP1.application;

import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonVO;

import javax.swing.*;
import java.util.List;

public interface PersonService {

    PersonVO create(PersonVO person);

    PersonVO findById(Long idPers);
    List<PersonVO> findAll();
    Person updatePers(Long IdPers, PersonVO person);
    void deletePers(Long idPers);

}
