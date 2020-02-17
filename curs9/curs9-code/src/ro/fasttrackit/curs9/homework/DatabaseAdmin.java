package ro.fasttrackit.curs9.homework;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin() {
        super();
        this.dbTechnology = "MySQL";
        System.out.println("This is a " + dbTechnology + " database admin");
    }
}
