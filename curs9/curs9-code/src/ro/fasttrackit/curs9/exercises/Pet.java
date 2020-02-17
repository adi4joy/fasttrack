package ro.fasttrackit.curs9.exercises;

public abstract class Pet implements Animal {
    private final int legs;

    public Pet(int legs) {
        this.legs=legs;
    }

    @Override
    public void eat(String food) {
        System.out.println("The animal is eating" + food);
    }

//    @Override
//    public void talk() {
//        System.out.println("The animal is trying to talk");
//    }
    public abstract void talk();

    public abstract void color();

    public int noOfLegs(int legs) {
        return legs;
    }

    public abstract void pet();
}
