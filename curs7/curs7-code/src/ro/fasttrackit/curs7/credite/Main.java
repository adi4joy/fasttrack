package ro.fasttrackit.curs7.credite;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(6);
        Scanner fileScanner = new Scanner(new FileReader("credite.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("rezultate.txt"));
        while (fileScanner.hasNext()) {
//            String nume = fileScanner.next();
//            String prenume = fileScanner.next();
//            int salar = fileScanner.nextInt();
//            int credit = fileScanner.nextInt();
//            System.out.println(nume + " " + prenume + " " + salar + " " + credit);

            /* AM PUS CODUL DE SUS, DIRECT MAI JOS */
            Client client = new Client(fileScanner.next(), fileScanner.next(), fileScanner.nextInt(), fileScanner.nextInt());
            /* VERIFICAM NUMELE SI SUMA */
            //            System.out.println(client);

            CreditResult result = bank.analyze(client);
            System.out.println(result);
            writer.write(result.toString());
            writer.newLine();
        }
        writer.close();
    }
}
