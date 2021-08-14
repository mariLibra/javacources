package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иванов", "История");
        Student student = new Student("Петров", "А01");

        System.out.println(teacher.getSubjectName());
        System.out.println(student.getGroupName());

        teacher.printInfo();
        student.printInfo();
    }
}
