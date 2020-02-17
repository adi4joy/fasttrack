package ro.fasttrackit.curs9.exercises;

public class Dog extends Pet {
    private final String color;

    public Dog(String color) {
        super(4);
        this.color = color;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void pet() {
        System.out.println("Petting on the back");
    }

    @Override
    public void talk() {
        System.out.println("Bark");
    }

    @Override
    public void color() {
        System.out.println("My color is " + color);
    }

    @Override
    public int noOfLegs(int legs) {
        return 0;
    }

    public void protect() {
        System.out.println("I'm protecting my master");
    }
}
