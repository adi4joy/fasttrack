package ro.fasttrackit.curs8.Homework.ex1;

public class MainAds {
    public static void main(String[] args) {
        Ads facebook = new Facebook();
        Ads email = new Email();
        Ads print = new Print();

        new Company(email).advertise();
    }
}
