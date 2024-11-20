package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.Input;
import ee.ivkhkdev.HRDepartment.model.Employee;

import java.util.List;

public class AppHelperEmployee implements AppHelper<Employee> {

    private final Input input;
    public AppHelperEmployee(Input input) {
        this.input = input;
    }

    @Override
    public Employee create() {
//        Employee employee = new Employee();
//        System.out.println("");
//        Employee.(input.nextLine());
//        System.out.println("");
//        Employee.setLastName(input.nextLine());


        return null;
    }

    @Override
    public boolean print(List<Employee> listClass) {
        return false;
    }

    @Override
    public List<Employee> edit(List<Employee> listClass) {
        return List.of();
    }

    @Override
    public List<Employee> search() {
        return List.of();
    }
}
