package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("VESPA", 2020, "black");

        System.out.println("Motorbike: " + motorbike.getModel() + ", " + motorbike.getYear() + ", " + motorbike.getColor() + ".");

    }
}

class Motorbike{
    private String model;
    private int year;
    private String color;

    public Motorbike(String model, int year, String color){
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
