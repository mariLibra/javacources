package day12;

import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList = new ArrayList<>();

        autoList.add("Audi");
        autoList.add("BMW");
        autoList.add("Lada");
        autoList.add("Tesla");
        autoList.add("Mercedes");

        System.out.println(autoList);

        //добавляем один автомобиль в середину списка
        autoList.add((autoList.size()+1)/2, "VW");

        System.out.println(autoList);

        //удаляем самый первый автомобиль в списке
        autoList.remove(0);

        System.out.println(autoList);

    }
}
