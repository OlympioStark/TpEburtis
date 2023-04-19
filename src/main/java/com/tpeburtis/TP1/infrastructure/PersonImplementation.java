package com.tpeburtis.TP1.infrastructure;

import com.tpeburtis.TP1.application.PersonService;
import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonRepository;
import com.tpeburtis.TP1.domain.person.PersonVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonImplementation implements PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonImplementation(PersonRepository personRepository1) {
        this.personRepository = personRepository1;
    }

    @Override
    public PersonVO create(PersonVO person) {
        return null;
    }

    @Override
    public PersonVO findById(Long idPers) {
        return null;
    }

    @Override
    public List<PersonVO> findAll() {
        return null;
    }

    @Override
    public Person updatePers(Long IdPers, PersonVO person) {
        return null;
    }

    @Override
    public void deletePers(Long idPers) {

    }
}
