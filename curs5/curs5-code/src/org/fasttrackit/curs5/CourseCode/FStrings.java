package org.fasttrackit.curs5.CourseCode;

import java.util.Arrays;

public class FStrings {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(a.length());

        String longString = "Ana are mere";
        System.out.println(longString.substring(2, 5));
        System.out.println(longString.substring(0, longString.length()));
        System.out.println(longString.substring(4));

        char chrAt = longString.charAt(2);
        System.out.println(chrAt);

        char[] chrs = longString.toCharArray();
        System.out.println(Arrays.toString(chrs));
        String newone = new String(chrs);
        String phrase = "      Ceva care incepe si se termina cu spatii     ";
        System.out.println(phrase.trim());

        String[] words = longString.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println(longString.indexOf("are"));
        System.out.println(longString.indexOf("n"));

        System.out.println(longString.lastIndexOf('a'));

        System.out.println(longString.contains("are"));
        System.out.println(longString.contains("altceva"));

        longString = longString.replace("a", "b");
        System.out.println(longString);
    }
}
