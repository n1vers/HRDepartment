package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.entity.Person;
import ee.ivkhkdev.HRDepartment.helpers.Helper;
import ee.ivkhkdev.HRDepartment.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements AppService<Person> {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private Helper<Person> personHelper;

    @Override
    public boolean add() {
        try {
            Optional<Person> person = personHelper.create();
            if(person.isPresent()){
                personRepository.save(person.get());
                return true;
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }

    @Override
    public List<Person> list() {
        return List.of();
    }

    @Override
    public boolean print() {
        return personHelper.printList(personRepository.findAll());
    }

    @Override
    public boolean search() {
        return false;
    }

    @Override
    public boolean edit() {
        return false;
    }


}
