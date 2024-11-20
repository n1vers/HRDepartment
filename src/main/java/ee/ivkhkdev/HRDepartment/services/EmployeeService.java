package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Employee;

import java.util.List;

public class EmployeeService implements AppService<Employee> {

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
    public List<Employee> list() {
        return List.of();
    }
}
