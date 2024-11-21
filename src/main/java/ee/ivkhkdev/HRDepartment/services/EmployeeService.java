package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.helpers.EmployeeAppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.AppRepository;
import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements AppService<Employee> {

    private final AppHelper<Employee> employeeAppHelper;
    private final AppRepository<Employee> repository;

    @Autowired
    public EmployeeService(EmployeeAppHelper employeeAppHelper, AppRepository<Employee> repository) {
        this.employeeAppHelper=employeeAppHelper;
        this.repository=repository;
    }

    @Override
    public boolean add() {
        Employee employee = employeeAppHelper.create();
        if(employee==null) return false;
        try {
            repository.save(employee);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

    @Override
    public boolean print(List<Employee> entities) {
        return employeeAppHelper.printList(entities);
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
