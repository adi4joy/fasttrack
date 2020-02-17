package org.fasttrackit.curs5.homework;

import java.util.Scanner;

public class EnhancedForLoop {
    public static void main(String[] args) {
/*        int arr[][] = {{1, 2, 3, 4}, {5, 6}, {7, 8, 9}};

        for (int x[] : arr) {
            for (int y : x) {
                System.out.println(y + "\t");
            }
            System.out.println();
        }
    }
*/
        int[][] myArr = {{1, 2, 3}, {4}, {5, 6, 7}};
        System.out.println("This is the result of [0][2] before assignment = " + myArr[0][2]);

        myArr[0][2] = 42;
        int x = myArr[1][0];
        int j = myArr[0][2];

        System.out.println("This is the result of [0][2] after assignment = " + myArr[0][2]);
        System.out.println("This is the result of x = " + x);
        System.out.println("This is the result of j = " + j);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                result += 10;
            } else {
                result += i;
            }
        }
        System.out.println(result);

        System.out.println("Scrieti o metoda intr-o clasa numita TestTR6 care returneaza media aritmetica a doua numere primite ca parametru");

        //               Semnatura metodei este: public static double avg(int a, int b)

//        Daca operanzii unei expresii aritmetice sunt de tip int atunci rezultatul va fi tot int. Daca unul din operanzii unei expresii aritmetice este double atunci intreg rezultatul va fi double. Observati ca parametrii metodei sunt int iar tipul returnat este double!

//                Pentru a trece testul numele metodei, parametrii si tipul returnat trebuie sa fie exact la fel cu cel specificat mai sus!");


//        public static double avg ( int a, int b){
//            int a = 15, b = 2;
//            return (a + b) / 2;
//        }

    }
}