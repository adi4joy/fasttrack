package ro.fasttrackit.curs6;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) throws Exception {
        Scanner fileScanner = new Scanner(new FileReader("test.txt"));

        BufferedWriter writer = new BufferedWriter(new FileWriter("exercitiu.txt"));
        while (fileScanner.hasNextLine()) {
            writer.write(fileScanner.nextLine());
            writer.newLine();
        }
        writer.close();

    }
}
