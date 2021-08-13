package day8;

public class Task1 {
    public static void main(String[] args) {

        //Вывод в консоль строки в результате конкатенации
        String string = "";

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            string += i + " ";
        }

        System.out.println(string);

        long stopTime = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime - startTime));

        //Вывод в консоль строки с помощью StringBuilder
        StringBuilder sb = new StringBuilder();

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i <= 20000; i++) {
            sb.append(i + " ");
        }

        System.out.println(sb);

        long stopTime1 = System.currentTimeMillis();

        System.out.println("Длительность работы, в мс: " + (stopTime1 - startTime1));

        System.out.println("Конкатенация строк прошла за " + (stopTime - startTime) + " мс, а StringBuilder отработал за " + (stopTime1 - startTime1) + " мс.");


    }
}
