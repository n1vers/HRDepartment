package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.Input;
import ee.ivkhkdev.HRDepartment.model.Employee;
import ee.ivkhkdev.HRDepartment.model.Person;
import ee.ivkhkdev.HRDepartment.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class EmployeeAppHelper implements AppHelper<Employee> {
    @Autowired
    private Input input;

    private final AppHelper<Person> personAppHelper;
    @Autowired
    public EmployeeAppHelper(AppHelper<Person> personAppHelper) {
        this.personAppHelper = personAppHelper;
    }

    @Override
    public Employee create() {
        Person person =personAppHelper.create();
        Employee employee = new Employee();
        System.out.println("Введите должность:");
        employee.setPosition(input.nextLine());
        System.out.println("Введите зарплату:");
        employee.setSalary(Integer.parseInt(input.nextLine()));
        System.out.println("Введите количество периодов работы:");
        int periodCount = Integer.parseInt(input.nextLine());
        String[] startDates = new String[periodCount];
        String[] endDates = new String[periodCount];

        for (int i = 0; i < periodCount; i++) {
            System.out.printf("Введите дату начала %d периода:%n", i + 1);
            employee.setStartDates(input.nextLine());
            System.out.printf("Введите дату окончания %d периода:%n", i + 1);
            endDates[i] = input.nextLine();
        }
        return employee;
    }

    @Override
    public boolean printList(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            System.out.println("Нету работников для отображения.");
            return false;
        }

        int count = 0;
        System.out.println("Список работников :");
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            Person person = employee.getPerson();
            System.out.printf("%d. %s %s (%s), Год рождения: %s, Должность: %s, Зарплата: %d, Читает: с %s по %s%n",
                    i + 1,
                    person.getFirstName(),
                    person.getLastName(),
                    person.getGender(),
                    person.getBirthYear(),  // Год рождения
                    employee.getPosition(),
                    employee.getSalary()
//                    formatWorkPeriods(employee.getStartDates(), employee.getEndDates())

            );
            count++;

        }
        return count > 0;
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
