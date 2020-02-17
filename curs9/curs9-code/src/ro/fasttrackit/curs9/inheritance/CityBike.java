package ro.fasttrackit.curs9.inheritance;

public class CityBike extends Bike {
    private String cartContent;

    public CityBike(String color) {
        super(color, 20);
        cartContent = "empty";
        color = "PINK";
    }

    public void addContent(String content) {
        cartContent = content;
    }

    public String getContent() {
        return cartContent;
    }

    @Override
    public void changeDirection(String newDirection) {
        super.changeDirection("CITY: " + newDirection);
        System.out.println("CityBike: change direction");
    }
}
