package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane = new Airplane("BRM Aero", 2020, 7, 335);

        airplane.setYear(2015);
        airplane.setLength(6);
        airplane.fillUp(10);
        airplane.fillUp(15);
        airplane.info();

    }
}