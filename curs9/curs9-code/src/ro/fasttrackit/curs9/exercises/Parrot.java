package ro.fasttrackit.curs9.exercises;

public class Parrot extends Pet {
    public Parrot() {
        super(2);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void talk() {
        System.out.println("Whatever you say");
    }

    @Override
    public void color() {
        System.out.println("every");
    }

    @Override
    public int noOfLegs(int legs) {
        return super.noOfLegs(legs);
    }

    @Override
    public void pet() {
        System.out.println("Just don't!");
    }
}
