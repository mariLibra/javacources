package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        int counterEight = 0;
        for (int arr : array) {
            if (arr > 8)
                counterEight++;
        }

        int counterOne = 0;
        for (int arr : array) {
            if (arr == 1)
                counterOne++;
        }

        int counterEven = 0;
        for (int arr : array) {
            if (arr % 2 == 0)
                counterEven++;
        }

        int counterOdd = 0;
        for (int arr : array) {
            if (arr % 2 != 0)
                counterOdd++;
        }

        int sum = 0;
        for (int arr : array) {
            sum += arr;
        }

        System.out.println("Введено число " + arrayLength + ". Сгенерирован следующий массив: " + Arrays.toString(array));
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + counterEight);
        System.out.println("Количество чисел равных 1: " + counterOne);
        System.out.println("Количество четных чисел: " + counterEven);
        System.out.println("Количество нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
