package org.fasttrackit.curs5.CourseCode;

public class FReplacer {
    public static void main(String[] args) {
        replace("Ana are mere", 'a');
        replace2("Ana are mere", 'a');
    }

    public static void replace2(String word, char ch) {
        String result = "";
        for (char charAt : word.toCharArray()) {
            if (charAt == ch) {
                result += "_";
            } else {
                result += charAt;
            }
        }
        System.out.println(result);
    }

    public static void replace(String word, char ch) {
        char[] chars = word.toCharArray();

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                result += '_';
            } else {
                result += chars[i];
            }
        }

        System.out.println(result);
    }
}
