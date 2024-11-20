package ee.ivkhkdev.HRDepartment.model;

import java.util.Objects;
import java.util.UUID;

public class Person {
    private UUID id;
    private String firstName;
    private String lastName;
    private String gender;
    private String phoneNumber;
    private String birthDay;
    private String birthMonth;
    private String birthYear;
    private Address address;
    private String bank;

    public Person() {
        this.id = UUID.randomUUID();
    }

    public Person( String firstName, String lastName, String gender, String phoneNumber, String birthDay, String birthMonth, String birthYear, Address address, String bank) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.address = address;
        this.bank = bank;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(birthDay, person.birthDay) && Objects.equals(birthMonth, person.birthMonth) && Objects.equals(birthYear, person.birthYear) && Objects.equals(address, person.address) && Objects.equals(bank, person.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, phoneNumber, birthDay, birthMonth, birthYear, address, bank);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", FirstName='").append(firstName).append('\'');
        sb.append(", LastName='").append(lastName).append('\'');
        sb.append(", Gender='").append(gender).append('\'');
        sb.append(", PhoneNumber='").append(phoneNumber).append('\'');
        sb.append(", BirthDay='").append(birthDay).append('\'');
        sb.append(", BirthMonth='").append(birthMonth).append('\'');
        sb.append(", BirthYear='").append(birthYear).append('\'');
        sb.append(", address=").append(address);
        sb.append(", Bank='").append(bank).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
