package ro.fasttrackit.curs12.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TryMaps {
    public static void main(String[] args) {
        List<String> l;
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Andrei", 3);
        grades.put("Marian", 10);
        grades.put("Olga", 9);

        System.out.println(grades);

        int grade = grades.get("Marian");
        System.out.println("Marian are nota " + grade);

        Integer altGrade = grades.get("Altcineva");
        System.out.println(altGrade);

        grades.put("Andrei", 5);
        System.out.println(grades.get("Andrei"));
        System.out.println(grades);

        grades.remove("Olga");
        System.out.println(grades);

        System.out.println(grades.keySet());
        System.out.println(grades.values());

        for (String key : grades.keySet()) {
            System.out.println(key + " = " + grades.get(key));
        }

        Map<String, List<String>> mapOfList = new HashMap<>();
        List<String> mathList = new ArrayList<>();
        mathList.add("Ana");
        mathList.add("Dorian");
        mapOfList.put("Math", mathList);
        List<String> physicsList = new ArrayList<>();
        physicsList.add("Marcel");
        mapOfList.put("Physics", physicsList);
    }
}
