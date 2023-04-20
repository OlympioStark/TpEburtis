package com.tpeburtis.TP1.infrastructure;

import com.tpeburtis.TP1.application.PersonService;
import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonRepository;
import com.tpeburtis.TP1.domain.person.PersonVO;
import com.tpeburtis.TP1.exceptions.EntityNotFoundException;
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
    public Person create(PersonVO person) {
        Person person2 = new Person(person);
        return personRepository.save(person2);
    }

    @Override
    public Person findById(Long idPers) {
        return personRepository.findById(idPers)
                .orElseThrow(() -> new EntityNotFoundException("Person with id " + idPers + "isn't exist"));
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person updatePers(Long idPers, PersonVO person) {
        Person person1 = personRepository.findById(idPers)
                .orElseThrow(() -> new EntityNotFoundException("Carte not exist with id : "+ idPers));

        person1.setLastName(person.getLastName());
        person1.setFirstName(person.getFirstName());
        person1.setAge(person.getAge());
        return personRepository.save(person1);
    }

    @Override
    public void deletePers(Long idPers) {
        personRepository.deleteById(idPers);
    }
}
