package ro.fasttrackit.curs8.Homework.ex3;

public class MainAnimal {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Mouse notMyMouse = new Mouse();
        Chicken myChicken = new Chicken();
        Duck myDuck = new Duck();

        System.out.println(myCat.walk());
        System.out.println(myDog.talk());
        System.out.println(notMyMouse.eat());
        System.out.println(myChicken.walk());
        System.out.println(myDuck.eat());

    }
}
