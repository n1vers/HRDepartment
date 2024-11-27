package ee.ivkhkdev.HRDepartment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Person   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private String bank;

    public Person() {

    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(birthDay, person.birthDay) && Objects.equals(birthMonth, person.birthMonth) && Objects.equals(birthYear, person.birthYear) && Objects.equals(bank, person.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, phoneNumber, birthDay, birthMonth, birthYear, bank);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", birthDay='").append(birthDay).append('\'');
        sb.append(", birthMonth='").append(birthMonth).append('\'');
        sb.append(", birthYear='").append(birthYear).append('\'');
        sb.append(", bank='").append(bank).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
