package ro.fasttrackit.curs9.homework.fanu;

import java.time.LocalDate;

public abstract class Employee implements Person {
    private final String firstName;
    private final String lastName;
    private final String address;
    private final LocalDate birthday;
    private final LocalDate dateOfEmployment;
    private final String position;
    protected final int salary;

    public Employee(String firstName, String lastName, String address, LocalDate birthday, LocalDate dateOfEmployment, String position, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
        this.salary = salary;
    }

    public abstract int getSalary();

    @Override
    public String getFistName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public LocalDate getBirthday() {
        return birthday;
    }
}
