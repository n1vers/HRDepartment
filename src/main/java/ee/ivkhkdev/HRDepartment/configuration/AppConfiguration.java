package ee.ivkhkdev.HRDepartment.configuration;

import ee.ivkhkdev.HRDepartment.helpers.EmployeeAppHelper;
import ee.ivkhkdev.HRDepartment.helpers.PersonAppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.model.Employee;
import ee.ivkhkdev.HRDepartment.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public AppHelper<Person> personAppHelper() {
        return new PersonAppHelper();
    }

    @Bean
    public AppHelper<Employee> employeeAppHelper(AppHelper<Person> personAppHelper) {
        return new EmployeeAppHelper(personAppHelper);
    }

}
