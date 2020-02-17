package ro.fasttrackit.curs10.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = fruits;
    }

    public boolean findApple() {
        return fruits.contains("apple");
    }

    public boolean findApplesMine() {
        for (String fruit : fruits) {
            if (fruit.equals("apple")) {
                return true;
            }
        }
        return false;
    }

    public void removeBanana() {
        fruits.remove("banana");
    }

    public int indexOrange() {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals("orange")) {
                return i;
            }
        }
        return -1;
    }

    public List<String> unique() {
        return new ArrayList<>(new HashSet<>(fruits));
    }

    public List<String> uniqueMine() {
        List<String> result = new ArrayList<>();
        for (String fruit : fruits) {
            if (!result.contains(fruit)) {
                result.add(fruit);
            }
        }

        return result;
    }
}
