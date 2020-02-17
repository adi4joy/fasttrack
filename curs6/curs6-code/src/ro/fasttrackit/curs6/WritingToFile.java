package ro.fasttrackit.curs6;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WritingToFile {
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        writer.write("This is Spartaaaa!");
        writer.close();
    }
}
