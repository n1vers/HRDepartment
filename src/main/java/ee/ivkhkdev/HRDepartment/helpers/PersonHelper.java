package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.input.Input;
import ee.ivkhkdev.HRDepartment.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PersonHelper implements Helper<Person> {
    @Autowired
   private Input input;
    @Override
    public Optional<Person> create() {
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

        return Optional.of(person);
    }catch (Exception e){
        return Optional.empty();
    }
}

    @Override
    public boolean printList(List<Person> persons) {
        if(persons.isEmpty()){
            System.out.println("Список работников пуст");
            return false;
        }
        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            System.out.printf("%d. %s %s. %s. %s. %s. %s. %s. %s%n",
                    i+1,
                    person.getFirstName(),
                    person.getLastName(),
                    person.getGender(),
                    person.getPhoneNumber(),
                    person.getBirthDay(),
                    person.getBirthMonth(),
                    person.getBirthYear(),
                    person.getBank()
            );
        }
        return true;
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