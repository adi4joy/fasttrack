package ro.fasttrackit.curs7.homework;

public class Person {
    private String name;
    private int age;
    private boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String isMarried() {
        if (married) {
            return "married";
        } else {
            return "not married";
        }
    }

    public String toString() {
        return name + " is " + age + " years old and is " + isMarried();
    }
}
