package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService implements AppService<Person> {

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean print(List<Person> entities) {
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


}
