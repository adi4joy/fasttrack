package ro.fasttrackit.curs10.homework.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    private final Set<Person> employees;

    public Company(Person manager) {
        this.employees = new HashSet<>();
        employ(new Person(manager.getName(), manager.getAge(), "manager"));
    }

    public boolean employ(Person person) {
        return employees.add(person);
    }

    public Person getManager() {
        for (Person person : employees) {
            if (person.getPosition().equals("manager")) {
                return person;
            }
        }
        return null;
    }

    public List<Person> getPersons(String position) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getPosition().equals(position)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getOlder(int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getAge() > age) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonsByName(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : employees) {
            if (person.getPosition().contains(name)) {
                result.add(person);
            }
        }
        return result;
    }
}
