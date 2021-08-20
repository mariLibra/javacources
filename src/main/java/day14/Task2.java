package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        parseFileToStringList(new File("people"));

    }

    public static List<String> parseFileToStringList(File file) {
        List<String> list = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            //считываем все строки в файле
            while (sc.hasNext()) {

                String name = sc.nextLine();
                //разделяем строку на элементы, второй элемент - это возраст,
                // если он <=0, то выбрасывается сообщение об ошибке
                String[] nameAge = name.split(" ");

                if (Integer.parseInt(nameAge[1]) <= 0)
                    throw new IOException();

                list.add(name);
            }

            System.out.println(list);
            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return list;
    }
}