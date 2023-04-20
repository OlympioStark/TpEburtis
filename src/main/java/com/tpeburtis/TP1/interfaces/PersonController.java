package com.tpeburtis.TP1.interfaces;

import com.tpeburtis.TP1.application.PersonService;
import com.tpeburtis.TP1.domain.person.Person;
import com.tpeburtis.TP1.domain.person.PersonVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/rest/person")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class PersonController {

    private final PersonService personService;
    private final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Person> fetchPersonById(@PathVariable("id") Long idPers) {

        logger.info("Inside fetchPersonById PersonController");
        Person persVO = personService.findById(idPers);
        return ResponseEntity.status(HttpStatus.OK).body(persVO);
    }

    @GetMapping()
    public ResponseEntity<List<Person>> fetchAllPerson() {
        logger.info("Inside fetchAllPerson: All person");
        List<Person> personList = personService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(personList);
    }

    @PostMapping()
    public ResponseEntity<Person> createPerson(@Validated @RequestBody PersonVO pers) {
        logger.info("Inside createPerson PersonController");
        Person persVO = personService.create(pers);
        return ResponseEntity.status(HttpStatus.CREATED).body(persVO);
    }

    @PutMapping("{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable("id") Long idPers, @Validated @RequestBody PersonVO persVo) {
        logger.info("Inside updatePerson PersonController");
        Person person = personService.updatePers(idPers, persVo);
        return  ResponseEntity.status(HttpStatus.OK).body(person);
    }

    @DeleteMapping("{id}")
    public  ResponseEntity<Person> deletePerson(@PathVariable("id") Long idPs) {
        logger.info("Inside deletePerson PersonController");
        personService.deletePers(idPs);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
    }
}
