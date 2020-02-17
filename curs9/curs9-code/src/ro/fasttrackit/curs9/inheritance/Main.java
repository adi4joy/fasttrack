package ro.fasttrackit.curs9.inheritance;

public class Main {
    public static void main(String[] args) {
//        Bike bike = new CityBike();
        CityBike bike = new CityBike("RED");
        bike.changeDirection("RIGHT");
        bike.addContent("mere");
        System.out.println(bike.getDirection());
        System.out.println(bike.getContent());
        System.out.println(bike);
        bike.changeColor(2);
        System.out.println(bike);

        Bike mountainBike = new MountainBike("PINK", 6);
        mountainBike.changeColor("BLACK");
        System.out.println(mountainBike);
    }
}
