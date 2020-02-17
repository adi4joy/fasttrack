package ro.fasttrackit.curs9.homework;

public class Programmer extends Employee {
    private String language;

    public Programmer() {
        super();
        this.language = "Java";
        System.out.println("This is a " + language + " programmer");
    }
}
