package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            int counter = a + 1;
            while (counter < b) {
                if (counter % 5 == 0 && counter % 10 != 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
        }
    }
}
