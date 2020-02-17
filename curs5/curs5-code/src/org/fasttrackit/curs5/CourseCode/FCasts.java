package org.fasttrackit.curs5.CourseCode;

public class FCasts {
    public static void main(String[] args) {
        int a = 32;
        byte b = (byte) a;
        byteFunction((byte) a);

        int bigInt = 128;
        byte bb= (byte) bigInt;
        System.out.println(bb);
    }

    public static void byteFunction(byte b) {
        System.out.println(b);
    }
}
