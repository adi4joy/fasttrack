package ro.fasttrackit.curs6;

import java.io.FileReader;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws Exception {
        Scanner fileScanner = new Scanner(new FileReader("test.txt"));
        String line = fileScanner.nextLine();
        int n = fileScanner.nextInt();
        double z = fileScanner.nextDouble();

        System.out.println(line);
        System.out.println(n);
        System.out.println(z);

    }
}
