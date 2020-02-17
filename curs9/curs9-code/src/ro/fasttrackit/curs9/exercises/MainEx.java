package ro.fasttrackit.curs9.exercises;

public class MainEx {
    public static void main(String[] args) {
        Dog dog = new Dog("BLACK");
        dog.protect();
        dog.talk();
        dog.color();

        Animal pet = new Cat("WHITE");
        pet.eat("tacos");
//        System.out.println(pet.noOfLegs());

        playWithPet(dog);

    }

    private static void playWithPet(Pet pet) {
        pet.pet();
        pet.eat("something good");
        pet.talk();
//        System.out.println(pet.noOfLegs());
    }
}
