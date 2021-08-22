package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        try {
            File file1 = new File("file1.txt");

            PrintWriter pw1 = new PrintWriter(file1);

            for (int i = 0; i < 1000; i++) {
                pw1.println((int) (Math.random() * 101));
            }

            pw1.close();

            File file2 = new File("file2.txt");
            Scanner sc = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);

            for (int i = 0; i < 50; i++) {
                double sum = 0;

                for (int j = 0; j < 20; j++) {
                    sum += Integer.parseInt(sc.nextLine());
                }

                double average = sum / 20.0;

                pw2.println(average);
            }

            sc.close();
            pw2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        printResult(new File("file2.txt"));

    }

    //рассчитать сумму всех вещественных чисел из файла
    // и вывести её в консоль, отбросив вещественную часть
    public static void printResult(File file) {
        try {
            double sum = 0.0;
            double counter = 0.0;
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                sum += Double.parseDouble(sc.nextLine());
                counter++;
            }

            int average = (int) (sum / counter);

            System.out.println(average);

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}