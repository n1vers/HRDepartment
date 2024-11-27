package ee.ivkhkdev.HRDepartment.services;


import ee.ivkhkdev.HRDepartment.helpers.Helper;
import ee.ivkhkdev.HRDepartment.repositories.EmployeeRepository;
import ee.ivkhkdev.HRDepartment.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements AppService<Employee> {
    @Autowired
    private Helper<Employee> employeeHelper;
    @Autowired
    private  EmployeeRepository employeeRepository;

    @Override
    public boolean add() {
        try {
            Optional<Employee> employee = employeeHelper.create();
            if(employee.isPresent()){
                employeeRepository.save(employee.get());
                return true;
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
            return false;
    }

    @Override
    public List<Employee> list() {
        return List.of();
    }

    @Override
    public boolean print() {
        return employeeHelper.printList(employeeRepository.findAll());
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
