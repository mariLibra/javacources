package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etage = sc.nextInt();

        if (etage <= 0) {
            System.out.println("Ошибка ввода");
        } else if (etage < 5) {
            System.out.println("Малоэтажный дом");
        } else if (etage < 9) {
            System.out.println("Среднеэтажный дом");
        } else
            System.out.println("Многоэтажный дом");
    }
}