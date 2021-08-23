package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(717771237)); // 5
    }

    public static int count7(int number) {
        int counter = 0;

        if (number == 0)
            return 0;

        if (number % 10 == 7) {
            counter++;
        }

        return counter + count7(number / 10);
    }
}
