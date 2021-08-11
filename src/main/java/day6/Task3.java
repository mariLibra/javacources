package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Ben", "Mathe");
        Student student = new Student("Pol");

        System.out.println(teacher.evaluate(student));
    }
}
