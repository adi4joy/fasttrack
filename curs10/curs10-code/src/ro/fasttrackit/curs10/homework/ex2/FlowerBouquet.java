package ro.fasttrackit.curs10.homework.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FlowerBouquet {
    private Set<String> bouquet;

    public FlowerBouquet(Set<String> bouquet) {
        this.bouquet = bouquet;
        bouquet.add("tulip");
        bouquet.add("rose");
        bouquet.add("lily");
    }

    public Set<String> getAll() {
        return bouquet;
    }

    public void addFlower (String flower) {
        List<String> result = new ArrayList<>();
        for (String flowers : bouquet) {
            if (!result.contains(flower)) {
                result.add(flower);
            }
        }
    }

    public void removeFlower (String flower) {
        bouquet.remove(flower);
    }

    @Override
    public String toString() {
        return "FlowerBouquet{" +
                "bouquet=" + bouquet +
                '}';
    }
}
