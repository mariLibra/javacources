package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printResult(new File("test16"));


    }

    public static void printResult(File file) {

        try {
            int sum = 0;
            int counter = 0;

            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                sum += Integer.parseInt(sc.next());
                counter++;
            }
            sc.close();

            double average = (double) sum / (double) counter;

            System.out.print(average + " --> " + (double) Math.round(average * 1000) / 1000);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

