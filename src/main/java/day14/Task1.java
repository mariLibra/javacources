package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        printSumDigits(new File("test1"));
    }

    public static void printSumDigits(File file) {
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            String[] numbersString = line.split(" ");

            if (numbersString.length != 10) {
                throw new IOException();
            }

            int[] numbers = new int[10];
            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
                sum += numbers[i];
            }
            System.out.println(sum);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

    }
}