package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Сумма периметров красных фигур: " + calculateRedPerimeter(figures));

        System.out.println("Сумма площадей красных фигур: " + calculateRedArea(figures));


    }

    //сумма периметров красных фигур
    public static double calculateRedPerimeter(Figure[] figures) {
        double perimeterOfRedFigures = 0;

        for (Figure figure : figures) {
            if (figure.color.equals("Red")) {
                perimeterOfRedFigures += figure.perimeter();
            }
        }
        return perimeterOfRedFigures;
    }

    //сумма площадей красных фигур
    public static double calculateRedArea(Figure[] figures) {
        double areaOfRedFigures = 0;

        for (Figure figure : figures) {
            if (figure.color.equals("Red")) {
                areaOfRedFigures += figure.area();
            }
        }
        return areaOfRedFigures;
    }
}
