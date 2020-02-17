package ro.fasttrackit.curs10.collections;

import java.util.*;

public class TryCollections {
    public static void main(String[] args) {
        tryArrayList();
        tryHashSet();
    }

    private static void tryHashSet() {
        Set<String> fruits = new HashSet<>();
        fruits.add("apples");
        fruits.add("oranges");
        fruits.add("bananas");
        fruits.add("oranges");

        System.out.println(fruits);
        fruits.remove("apples");

        for (String fruit: fruits) {
            System.out.println(fruits);
        }

        System.out.println("iterator print:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String nextElement = iterator.next();
            System.out.println(nextElement);
        }
    }

    private static void tryArrayList() {
        List<String> fruits = new ArrayList<>();
        fruits.add("apples");
        fruits.add("oranges");

        List<String> betterFruits = new ArrayList<>();
        betterFruits.addAll(fruits);
        betterFruits.add("strawberry");
        betterFruits.remove("apples");

        System.out.println(fruits);
        System.out.println(betterFruits);
        System.out.println(fruits.get(1));

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        fruits.add(1,"kiwi");
        System.out.println(fruits);

        Iterator<String> iterator =fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
