package ro.fasttrackit.curs9.homework.fanu;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Programmer("Matei",
                "Popescu",
                1000,
                "Oradea",
                LocalDate.of(1990,1,15),
                LocalDate.of(2020,06,01),
                "Java");

        employee.getSalary();
        employee.getDateofEmployment;
    }

    private String printCardLine(String line) {
        return "- " + line + printSpaces(50-3-line.length()+ "-")
    }

    private String printSpaces(int n, String fill) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += fill;
        }
        return result;
    }
}
