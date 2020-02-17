package ro.fasttrackit.curs9.homework.fanu;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.YEARS;

public class PersonalData {
    private final Person person;

    public PersonalData(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFistName() + " " + person.getLastName();
    }

    public int getAge() {
        LocalDate birthday = person.getBirthday();
        LocalDate now = LocalDate.now();
        long years = now.until(birthday,YEARS);
//        int birthYear =
        return birthday;
    }
}
