package ro.fasttrackit.curs7.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(new FileReader("homeworkReadPersons.txt"));
        while (fileScanner.hasNext()) {
            Person person = new Person(fileScanner.next(), fileScanner.nextInt(), fileScanner.nextBoolean());
            System.out.println(person);
        }

        Product product1 = new Product("pineapple", 3.5, 25, "fruit");
        System.out.println(product1);

        Product product2 = new Product("table", 650, 40, "furniture");
        System.out.println(product2);

        Product product3 = new Product("headphones", 85.50, 100, "electronics");
        System.out.println(product3);

        Bottle bottle = new Bottle(500, 300);
        System.out.println("The bottle has liquid: " + bottle.hasLiquid());
        System.out.println("Available liquid: " + bottle.getAvailableLiquid() + " ml");
        System.out.println("The bottle is missing " + bottle.emptyCapacity() + " ml");
        System.out.println(bottle.open());
        System.out.println(bottle.isOpen());
        System.out.println(bottle.drink(350));
        Bottle bottle1 = new Bottle();
        Bottle bottle2 = new Bottle(600);
    }
}
