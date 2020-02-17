package ro.fasttrackit.curs6;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingWithBuffered {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("test.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
