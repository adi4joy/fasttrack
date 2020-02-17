package ro.fasttrackit.curs9.homework;

import java.time.LocalDateTime;

public class Employee {
    private String firstName;
    private String lastName;
    private LocalDateTime birthDay;
    private String address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

        public void setBirthDay(LocalDateTime birthDay) {
            this.birthDay = birthDay;
        }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
         return "This employee is called " + firstName + " " + lastName + " born on " + birthDay + " who lives at " + address;
    }
}
