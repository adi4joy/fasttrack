package org.fasttrackit.curs5;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "abc";
//        String b = "abc";
        String b = new String("abc"); // cele cu litere mari sunt obiecte si atunci trebuie folosit "equals" ca sa verifici continutul

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a.length()); // lungime

        String longString = "Ana are mere";
        System.out.println(longString.substring(2, 5));
        System.out.println(longString.substring(0, longString.length()));
        System.out.println(longString.substring(4));

        char chrAt = longString.charAt(2);
        System.out.println(chrAt);

        char[] chrs = longString.toCharArray();
        System.out.println(Arrays.toString(chrs));

        String phrase = "      Ceva care incepe si se tremina cu spatii                ";
        System.out.println(phrase.trim());

        String[] words = longString.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(longString.indexOf("are")); // prima pozitie a cuvantului
        System.out.println(longString.indexOf("n")); // prima pozitie a literei

        System.out.println(longString.contains("are"));
        System.out.println(longString.contains("altceva"));

        String result = longString.replace("are", "a avut");
        System.out.println(longString); // Stringul ramane nemodificat
        System.out.println(result); // trebuie creata o variabila noua

        stringReplace("Mercedes Benz", 'e');
        stringReplace2("Mercedes Benz", 'e');

    }

    public static void stringReplace(String word, char character) {
        String modified = word.replace(character, '_');
        System.out.println(modified);
    }

    public static void stringReplace2(String word, char character) {
        char[] modified = word.toCharArray();
        for (int i = 0; i < modified.length; i++) {
            if (modified[i] == character) {
                System.out.print('_');
            } else {
                System.out.print(modified[i]);
            }
        }
    }

    public static void replace (String word, char ch) {
        char[] chars = word.toCharArray(); // DE CONTINUAT ACASA DE PE SLIDE-UL DE LA CURS!!!
    }
}
