package org.fasttrackit.curs5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("countChar(\"Pneumonoultramicroscopicsilicovolcaniconioza\",'o')=" + countChar("Pneumonoultramicroscopicsilicovolcaniconioza", 'o'));
        System.out.println("The hidden word is " + redact("Betania"));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti cuvantul cheie: ");
        phrase(new String[]{"Ana", "are", "mere"}, scanner.nextLine());
        System.out.println(Arrays.toString(phrase2("Ana are multe mere din pomul din curtea vecinilor")));
        confidential("Ana are mere multe mere bune", new String[]{"mere", "Ana"});
    }

    public static int countChar(String word, char character) {
        char[] expression = word.toCharArray();
        int count = 0;
        for (int i = 0; i < expression.length; i++) {
            if (expression[i] == character) {
                count++;
            }
        }
        return count;
    }

    public static String redact(String word) {
        char[] ch = word.toCharArray();
        String stars = "";
        for (char charAt : word.toCharArray()) {
            stars += "*";
        }
        return stars;
    }

    public static void phrase(String[] arrayPhrase, String keyword) {
//        String propozitie = Arrays.toString(arrayPhrase);
//        System.out.println("contains(" + propozitie + ", " + keyword + ") = " + propozitie.contains(keyword));
        boolean condition = false;
        for (String s : arrayPhrase) {
            if (keyword.equals(s)) {
                condition = true;
                break;
            }
        }
        if (condition) {
            System.out.println("The word has been found");
        } else
            System.out.println("The word has not been found");

    }


    public static String[] phrase2(String phrase) {
        String[] wordsArray = phrase.split(" ");
        return wordsArray;
    }

    public static void confidential(String finalPhrase, String[] sensitiveWords) {
//       NU IMI IESE :(
//        boolean condition = false;
//        for (String sensitiveWord : sensitiveWords) {
//            condition = finalPhrase.contains(sensitiveWord);
//        }
//        if (condition) {
            String result = finalPhrase.replace(Arrays.toString(sensitiveWords),"****");
            System.out.println(result);
//        } else
//            System.out.println("ERROR");

    }
}