package ro.fasttrackit.curs9.homework;


import java.time.LocalDateTime;

public interface Person {
    void getFirstName(String firstName); // gresit sa aiba ceva in paranteze!!
    void getLastName(String lastName);
    void getBirthDay(LocalDateTime birthDay);
    void getAddress (String address);
}
