package ee.ivkhkdev.HRDepartment.configuration;

import ee.ivkhkdev.HRDepartment.input.ConsoleInput;
import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.interfaces.Input;
import ee.ivkhkdev.HRDepartment.model.Address;
import ee.ivkhkdev.HRDepartment.model.Employee;
import ee.ivkhkdev.HRDepartment.model.Person;
import ee.ivkhkdev.HRDepartment.services.AddressService;
import ee.ivkhkdev.HRDepartment.services.EmployeeService;
import ee.ivkhkdev.HRDepartment.services.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class AppConfiguration {
    @Bean
    public Input input(){
        return new ConsoleInput(new Scanner(System.in));
    }
    @Bean
    public AppService<Employee> employeeAppService(){
        return new EmployeeService();
    }
    @Bean
    public AppService<Person> personAppService(){
        return new PersonService();
    }
    @Bean
    public AppService<Address> addressAppService(){
        return new AddressService();
    }
}
