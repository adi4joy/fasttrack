package ro.fasttrackit.curs10.homework.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {
    private List<String> fruitBasket;

    public Basket(List<String> fruitBasket) {
        this.fruitBasket = fruitBasket;
        fruitBasket.add("strawberry");
        fruitBasket.add("orange");
        fruitBasket.add("cherry");
        fruitBasket.add("banana");
        fruitBasket.add("apple");
    }

    public boolean findFruit(String searchedFruit) {
        return fruitBasket.contains(searchedFruit);
    }

    public boolean removeFruit(String removedFruit) {
        fruitBasket.remove(removedFruit);
        return fruitBasket.contains(removedFruit);
    }

    public void addFruit(String addedFruit) {
        fruitBasket.add(addedFruit);
    }

    public int fruitPosition(String fruitPosition) {
        for (int i = 0; i < fruitBasket.size(); i++) {
            if (fruitBasket.get(i).equals(fruitPosition)) {
                return i;
            }
        }
        return -1;
    }

    public Collection<String> distinct() {
        Collection<String> newBasket = new ArrayList<>();
        for (String fruits : fruitBasket) {
            if (!newBasket.contains(fruits)) {
                newBasket.add(fruits);
            }
        }
        return newBasket;
    }

    public int countFruit() {
        return fruitBasket.size();
    }

    public int customCountFruit() {
        int count = 0;
        for (int i = 0; i < fruitBasket.size(); i++) {
            count += i;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruitBasket=" + fruitBasket +
                '}';
    }
}