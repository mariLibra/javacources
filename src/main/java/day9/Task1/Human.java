package day9.Task1;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //вывод в консоль информации о человеке
    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }


}
