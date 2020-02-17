package ro.fasttrackit.curs9.homework.fanu;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private final String dbTech;
    public DatabaseAdmin(String firstName,
                      String lastName,
                      int salary,
                      String address,
                      LocalDate birthday,
                      LocalDate dateOfEmployment,
                      String position,
                      String dbTech) {
        super(firstName, lastName, address, birthday, dateOfEmployment, "programmer");
        this.salary = salary;
        this.language = language;
    }

    public int getSalary() {
        return salary + 2_000;
    }

    public String getDbTech() {
        return dbTech;
    }
}
