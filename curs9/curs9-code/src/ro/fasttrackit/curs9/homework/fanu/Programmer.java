package ro.fasttrackit.curs9.homework.fanu;

import java.time.LocalDate;

public class Programmer extends Employee {
    private final int salary;
    private final String language;

    public Programmer(String firstName,
                      String lastName,
                      int salary,
                      String address,
                      LocalDate birthday,
                      LocalDate dateOfEmployment,
                      String language) {
        super(firstName, lastName, address, birthday, dateOfEmployment, "programmer");
        this.salary = salary;
        this.language = language;
    }

    public int getSalary() {
        return salary + 1_000;
    }
}
