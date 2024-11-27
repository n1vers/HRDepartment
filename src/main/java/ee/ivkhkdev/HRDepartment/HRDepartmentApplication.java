package ee.ivkhkdev.HRDepartment;

import ee.ivkhkdev.HRDepartment.services.AppService;
import ee.ivkhkdev.HRDepartment.input.Input;
import ee.ivkhkdev.HRDepartment.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HRDepartmentApplication implements CommandLineRunner {
	@Autowired
	private Input input;
	@Autowired
	private AppService<Employee> employeeAppService;

	public static void main(String[] args) {
		SpringApplication.run(HRDepartmentApplication.class, args);
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
					if(employeeAppService.print()){
						System.out.println("Список");
					}else{
						System.out.println("Списка нет");
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
