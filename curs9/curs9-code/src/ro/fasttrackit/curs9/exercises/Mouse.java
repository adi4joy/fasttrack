package ro.fasttrackit.curs9.exercises;

public class Mouse implements Animal {
    private int legs = 4;
    @Override
    public void eat(String food) {
        System.out.println("Mouse eating" + food);
    }

    @Override
    public void talk() {
        System.out.println("Mouse talking");

    }

    @Override
    public void color() {
        System.out.println("grey");
    }

    @Override
    public int noOfLegs(int legs) {
        return this.legs;
    }
}
