package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.entity.Employee;
import ee.ivkhkdev.HRDepartment.entity.User;
import ee.ivkhkdev.HRDepartment.input.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class UserAppHelper implements Helper<User> {
    @Autowired
    private Input input;
    @Autowired
    private Helper<Employee> employeeHelper;

    @Override
    public Optional<User> create() {
        try {
            User user = new User();
            System.out.println("Логин: ");
            user.setLogin(input.nextLine());
            System.out.println("Пароль:");
            user.setPassword(input.nextLine());
            Optional<Employee> employee = employeeHelper.create();
            if (employee.isEmpty()) {
                return Optional.empty();
            }
            user.setEmployee(employee.get());
            user.setRegDate(LocalDate.now());
            return Optional.of(user);
        }catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public boolean printList(List<User> entities) {
        return false;
    }

    @Override
    public List<User> update(List<User> entities) {
        return List.of();
    }

    @Override
    public List<User> search() {
        return List.of();
    }
}
