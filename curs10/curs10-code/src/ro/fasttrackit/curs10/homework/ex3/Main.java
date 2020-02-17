package ro.fasttrackit.curs10.homework.ex3;

public class Main {
    public static void main(String[] args) {
        Company company = new Company((new Person("Gyuri", 25, "manager")));
        boolean result = company.employ(new Person("Marian", 24, "programator"));
        System.out.println("employed? " + result);
        result = company.employ((new Person("Dorel", 45, "instalator")));
        result = company.employ((new Person("Costel", 30, "instalator")));
        System.out.println("employed? " + result);

        System.out.println(company.getManager());
        System.out.println(company.getPersons("instalator"));

        System.out.println(company.getOlder(23));
    }
}
