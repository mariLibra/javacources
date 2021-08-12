package day7;


public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("boeing", 1990, 20000, 60000);
        Airplane airplane2 = new Airplane("BRM Aero", 2020, 7, 335);

        Airplane.compareAirplanes(airplane1, airplane2);

    }
}