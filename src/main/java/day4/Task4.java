package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i= 0; i < array.length; i++){
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));

        int maxSum = 0;
        int maxSumIdx = 0;
        for (int i =0; i< array.length-2; i++){

            int summe = 0;
            for (int j = i; j< i+3; j++){
                summe += array[j];
            }

            if (summe > maxSum){
                maxSum = summe;
                maxSumIdx = i;
            }

        }
        System.out.println("Max Summa is " + maxSum);
        System.out.println("First element is " + maxSumIdx);
    }
}
