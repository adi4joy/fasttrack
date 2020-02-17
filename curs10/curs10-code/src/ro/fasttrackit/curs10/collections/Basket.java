package ro.fasttrackit.curs10.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Basket {
    private final List<String> fruitList;


    public Basket(List<String> fruitList) {
        this.fruitList = fruitList;
        fruitList.add("orange");
        fruitList.add("banana");
        fruitList.add("apple");
    }

    public boolean findApple() {
        return fruitList.contains("apple");
    }

    public boolean findApple2() {
        for (String fruits : fruitList) {
            if (fruits.equals("apple")) {
                return true;
            }
        }
        return false;
    }

    public void removeBanana() {
        fruitList.remove("banana");
    }

    public int findOrange() {
        for (int i = 0; i < fruitList.size(); i++) {
            if (fruitList.get(i).equals("orange")) {
                return i;
            }
        }
        return -1;
    }

    public List<String> unique() {
        return new ArrayList<>(new HashSet<>(fruitList));
    }

    public List<String> uniqueMine() {
        List<String> result = new ArrayList<>();
        for (String fruit : fruitList) {
            if (!result.contains(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }

}
