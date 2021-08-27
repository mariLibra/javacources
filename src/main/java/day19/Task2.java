package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/numbers19.txt");
        long min = 500000000L;
        long max = 600000000L;

        Scanner sc = new Scanner(file);
        Set<Long> numbers = new HashSet<>();
        int current = 0;

        //добавляем все числа в set
        while (sc.hasNext()) {
            long n = Long.parseLong(sc.nextLine());
            numbers.add(n);
        }
        sc.close();

        long startTime = System.currentTimeMillis();

        //проверяем, сколько чисел лежит в заданном диапазоне
        for (Long n : numbers) {
            if (n >= min && n <= max) {
                current++;
            }
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(current);

        System.out.println("Длительность работы, в мс: " + (stopTime - startTime)); //Длительность работы, в мс: 38

        //решим эту задачу с помощью ArrayList'a
        Scanner sc1 = new Scanner(file);

        List<Long> list = new ArrayList<>();
        int current2 = 0;

        while (sc1.hasNext()) {
            long n = Long.parseLong(sc1.nextLine());
            list.add(n);
        }

        sc1.close();

        long startTime2 = System.currentTimeMillis();
        //проверяем, сколько чисел лежит в заданном диапазоне
        for (Long n : list){
            if (n >= min && n <= max) {
                current2++;
            }
        }

        long stopTime2 = System.currentTimeMillis();

        System.out.println(current2);

        System.out.println("Длительность работы, в мс: " + (stopTime2 - startTime2)); //Длительность работы, в мс: 22.
    }
}
