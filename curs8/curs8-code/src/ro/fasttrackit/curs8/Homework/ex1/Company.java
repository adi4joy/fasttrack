package ro.fasttrackit.curs8.Homework.ex1;

public class Company {
    private Ads ads;

    public Company(Ads ads) {
        this.ads = ads;
    }

    public void advertise() {
        this.ads.adServices("banner");
        System.out.println("Advertisement published!");
    }
}
