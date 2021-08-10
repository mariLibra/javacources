package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int maxSumIdx = 0;

        for (int i = 0; i < matrix.length; i++) {

            int summe = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                summe += matrix[i][j];
            }
            if (summe >= maxSum){ // >= выводит последнюю мах сумму, если несколько одинаковых мах сумм
                maxSum = summe;
                maxSumIdx = i;
            }

        }
        System.out.println("MaxSumme is " + maxSum + " in " + maxSumIdx + "'th line ");
    }
}
