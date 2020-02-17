package ro.fasttrackit.curs9.homework;

import java.time.LocalDateTime;

public class Ex2 {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private LocalDateTime today;

    public LocalDateTime setBirthDay(LocalDateTime birthDay) {
        return this.birthDay = birthDay;
    }

    public LocalDateTime getToday(LocalDateTime today) {
        return this.today = today;
    }

/*    public int getAge (int age) {
        int age = (int) today - birthDay;
        return age;
    }
*/
    public String getFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        return firstName + " " + lastName;
    }
}
