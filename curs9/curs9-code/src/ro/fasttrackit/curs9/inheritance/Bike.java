package ro.fasttrackit.curs9.inheritance;

public class Bike {
    private String color;
    private String direction;
    private int maxSpeed;

    public Bike(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.direction = "FORWARD";
    }

    public void changeColor(String color) {
        if ("PINK".equals(color)) {
            System.out.println("Get a life!");
            this.color = "BLUE";
        } else {
            this.color = color;
        }
        this.color = color;
    }

    public void changeColor(String color, String complementary) {
        changeColor(color + complementary);
    }

    public void changeColor(int day) {
        switch (day) {
            case 1:
                changeColor("RED");
                break;
            case 2:
                changeColor("YELLOW");
                break;
            default:
                changeColor("GREEN");
        }
    }

    public void superSecret() {
        System.out.println("This is a secret");
    }

    public void changeDirection(String newDirection) {
        superSecret();
        System.out.println("Bike: change direction");
        this.direction = newDirection;
    }

    public String getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "color='" + color + '\'' +
                ", direction='" + direction + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
