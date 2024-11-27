package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.input.Input;
import ee.ivkhkdev.HRDepartment.entity.Employee;
import ee.ivkhkdev.HRDepartment.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeHelper implements Helper<Employee> {
    @Autowired
    private Input input;
    @Autowired
    private  Helper<Person> personHelper;


    @Override
    public Optional<Employee> create() {
        try {
            Optional<Person> person = personHelper.create();
            if (person.isEmpty()) {
                return Optional.empty();
            }
            Employee employee = new Employee();
            employee.setPerson(person.get());
            System.out.println("Введите должность:");
            employee.setPosition(input.nextLine());
            System.out.println("Введите зарплату:");
            employee.setSalary(Integer.parseInt(input.nextLine()));
            return Optional.of(employee);
        }catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public boolean printList(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            System.out.println("Нету работников для отображения.");
            return false;
        }
        System.out.println("Список работников :");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            Person person = employee.getPerson();
            System.out.printf("%d. %s. %s. %s. %s. %s. %s%n",
                    i + 1,
                    person.getFirstName(),
                    person.getLastName(),
                    person.getGender(),
                    person.getBirthYear(),  // Год рождения
                    employee.getPosition(),
                    employee.getSalary()

            );

        }
        return true;
    }

    @Override
    public List<Employee> update(List<Employee> entities) {
        return List.of();
    }

    @Override
    public List<Employee> search() {
        return List.of();
    }
}
