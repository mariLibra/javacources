package day15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("shoes"));
            PrintWriter pw = new PrintWriter("missing_shoes");

            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] shoe = line.split(";");

               if (Integer.parseInt(shoe[2]) == 0) {
                   pw.println(line.replace(";", ", "));
               }
            }
            sc.close();
            pw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}