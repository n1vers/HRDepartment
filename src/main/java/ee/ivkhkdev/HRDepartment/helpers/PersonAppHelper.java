package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.interfaces.Input;
import ee.ivkhkdev.HRDepartment.model.Address;
import ee.ivkhkdev.HRDepartment.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class PersonAppHelper implements AppHelper<Person> {

   private Input input;

    @Override
    public Person create() {
    try{
        Person person = new Person();
        System.out.print("Имя работника: ");
        person.setFirstName(input.nextLine());
        System.out.print("Фамилия работника: ");
        person.setLastName(input.nextLine());
        System.out.print("Пол работника: ");
        person.setGender(input.nextLine());
        System.out.println("Номер телефона работника:");
        person.setPhoneNumber(input.nextLine());
        System.out.println("День рождения работника:");
        person.setBirthDay(input.nextLine());
        System.out.println("Месяц рождения работника:");
        person.setBirthMonth(input.nextLine());
        System.out.println("Год рождения работника:");
        person.setBirthYear(input.nextLine());
        System.out.println("Номер банковского счета:");
        person.setBank(input.nextLine());

        return person;
    }catch (Exception e){
        return null;
    }
}

    @Override
    public boolean printList(List<Person> people) {
        try {
            // Check if the list is empty
            if (people.size() == 0) return false;

            // Iterate through the list of people and print their details
            for (int i = 0; i < people.size(); i++) {
                Person person = people.get(i);
                System.out.printf("%d. %s %s. Телефон: %s%n",
                        i + 1,
                        person.getFirstName(),
                        person.getLastName(),
                        person.getPhoneNumber());
                System.out.printf("Дата рождения: %s/%s/%s%n",
                        person.getBirthDay(),
                        person.getBirthMonth(),
                        person.getBirthYear());
                System.out.printf("Банковский счёт: %s%n", person.getBank());
                System.out.printf("Пол: %s%n", person.getGender());
                Address address = person.getAddress();
                if (address != null) {
                    System.out.printf("Адрес: %s%n", address.toString());
                }
                System.out.println("------------------------------------------------");
            }
            return true;
        } catch (Exception e) {
            // Handle potential exceptions
            System.out.println("Error: " + e.toString());
            return false;
        }
    }

    @Override
    public List<Person> update(List<Person> entities) {
        return List.of();
    }

    @Override
    public List<Person> search() {
        return List.of();
    }
}