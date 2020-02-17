package ro.fasttrackit.curs9.homework;

import java.time.LocalDateTime;

public class MainHomework {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        DatabaseAdmin databaseAdmin = new DatabaseAdmin();

        programmer.setFirstName("Adi");
        programmer.setLastName("Strete");
        programmer.setBirthDay(LocalDateTime.now());
        programmer.setAddress("Eugen Groza 3");
        System.out.println(programmer);

        databaseAdmin.setFirstName("Ion");
        databaseAdmin.setLastName("Copil");
        databaseAdmin.setBirthDay(LocalDateTime.now());
        databaseAdmin.setAddress("Alexandru Vlahuta 10");

        System.out.println(databaseAdmin);

        Ex2 person = new Ex2();
        System.out.println(person.getToday(LocalDateTime.now()));
        System.out.println(person.getFullName("Adi", "Strete"));

    }
}
