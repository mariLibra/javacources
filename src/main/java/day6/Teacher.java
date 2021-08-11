package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String module;

    public Teacher(String name, String module) {
        this.name = name;
        this.module = module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String evaluate(Student student) {

        String note = "";

        Random random = new Random();
        int number = 2 + random.nextInt(3);

        switch (number) {
            case 2: note = "неудовлетворительно"; break;
            case 3: note = "удовлетворительно"; break;
            case 4: note = "хорошо"; break;
            case 5: note = "отлично"; break;
        }

        return "Преподаватель " + getName() +
                " оценил студента с именем " + student.getName() +
                " по предмету " + getModule() +
                " на оценку " + note ;
    }
}
