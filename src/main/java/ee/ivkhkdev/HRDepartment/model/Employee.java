package ee.ivkhkdev.HRDepartment.model;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Employee {
    private UUID id;
    private String position;
    private int salary ;
    private String[] startDates;
    private String[] endDates;
    private Person person;

    public Employee() {
        this.id = UUID.randomUUID();
    }

    public Employee( String position, int salary, String[] startDates, String[] endDates, Person person) {
        this.position = position;
        this.salary = salary;
        this.startDates = startDates;
        this.endDates = endDates;
        this.person = person;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String[] getStartDates() {
        return startDates;
    }

    public void setStartDates(String[] startDates) {
        this.startDates = startDates;
    }

    public String[] getEndDates() {
        return endDates;
    }

    public void setEndDates(String[] endDates) {
        this.endDates = endDates;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(id, employee.id) && Objects.equals(position, employee.position) && Objects.deepEquals(startDates, employee.startDates) && Objects.deepEquals(endDates, employee.endDates) && Objects.equals(person, employee.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position, salary, Arrays.hashCode(startDates), Arrays.hashCode(endDates), person);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", position='").append(position).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", startDates=").append(Arrays.toString(startDates));
        sb.append(", endDates=").append(Arrays.toString(endDates));
        sb.append(", person=").append(person);
        sb.append('}');
        return sb.toString();
    }
}
