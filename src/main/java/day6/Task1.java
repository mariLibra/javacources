package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car(2020);
        Motorbike motorbike = new Motorbike("bmw", "yellow", 1920);

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(2020));
        System.out.println(motorbike.yearDifference(1999));

    }
}
