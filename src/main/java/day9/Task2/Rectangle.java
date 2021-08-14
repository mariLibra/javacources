package day9.Task2;

public class Rectangle extends Figure {

    private int height;
    private int width;

    public Rectangle(int height, int width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (double )height * width;
    }

    @Override
    public double perimeter() {
        return (double) 2 * (height + width);
    }
}
