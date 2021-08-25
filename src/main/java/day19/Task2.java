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

        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(file);
        Set<Long> numbers = new HashSet<>();
        int current = 0;

        while (sc.hasNext()) {

            long n = Long.parseLong(sc.nextLine());
            //проверяем, лежит ли число в заданном диапазоне и не находится в нашем списке
            if (n >= min && n <= max && !numbers.contains(n)) {
                current++;
            }
            numbers.add(n);
        }

        sc.close();
        System.out.println(current);
        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime - startTime)); //Длительность работы, в мс: 665

        //решим эту задачу с помощью ArrayList'a
        long startTime2 = System.currentTimeMillis();

        Scanner sc1 = new Scanner(file);
        List<Long> list = new ArrayList<>();
        int current2 = 0;

        while (sc1.hasNext()) {

            long n = Long.parseLong(sc1.nextLine());
            //проверяем, лежит ли число в заданном диапазоне и не находится в нашем списке
            if (n >= min && n <= max && !list.contains(n)) {
                current2++;
            }
            list.add(n);
        }

        System.out.println(current2);
        long stopTime2 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime2 - startTime2)); //Длительность работы, в мс: 43223. Да, разница очевидна!

    }
}
