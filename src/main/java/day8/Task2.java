package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);

        System.out.print("Старый способ: ");
        airplane.info();

        System.out.print("Новый способ: " + airplane);

    }
}
