package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Person;

import java.util.List;

public class PersonService implements AppService<Person> {

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean print() {
        return false;
    }

    @Override
    public boolean search() {
        return false;
    }

    @Override
    public boolean edit() {
        return false;
    }

    @Override
    public List<Person> list() {
        return List.of();
    }
}
