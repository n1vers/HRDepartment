package ee.ivkhkdev.HRDepartment;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.interfaces.Input;
import ee.ivkhkdev.HRDepartment.model.Address;
import ee.ivkhkdev.HRDepartment.model.Employee;
import ee.ivkhkdev.HRDepartment.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
	private Input input;
	private AppService<Employee> employeeAppService;
	private AppService<Person> personAppService;
	private AppService<Address> addressAppService;

	@Autowired
	public App(Input input,AppService<Employee> employeeAppService,AppService<Person> personAppService,AppService<Address> addressAppService){
		this.input = input;
		this.employeeAppService = employeeAppService;
		this.personAppService = personAppService;
		this.addressAppService = addressAppService;

	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		boolean repeat=true;
		System.out.println("======HRDepartment======");
		do {
			System.out.println("Список задач:");
			System.out.println("0.выйти из программы");
			System.out.println("1.Добавить работника");
			System.out.println("2.список работников");
			System.out.println("3.изменить работника");
			System.out.println("4.найти работников по дате рождения");
			System.out.print("Введите номер задачи: ");
			int task=Integer.parseInt(input.nextLine());
			switch (task){
				case 0:
					System.out.println("Выход из программы");
					repeat=false;
					break;
				case 1:
					System.out.println("1.Добавить работника");
						if (employeeAppService.add()){
							System.out.println("Работник добавлена");
						}else {
							System.out.println("Работник не удалось добавить");
						}
				case 2:
					if (employeeAppService.print()){
						System.out.println("----------- Конец списка -----------");
					}
					break;
				case 3:
					System.out.println("Изменение работника");
					if(employeeAppService.edit()){
						System.out.println("Работник изменен");
					}else {
						System.out.println("Работника изменить не удалось");
					}
					break;
				case 4:
					System.out.println("Найти работника по дате рождения");
					if (employeeAppService.search()){
						System.out.println("----------- Конец списка -----------");
					}
					break;
			}
			System.out.println("==============================");
		}while(repeat);
		System.out.println("До свидания");
	}
}
