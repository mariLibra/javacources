package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        parseFileToObjList(new File("people"));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> members = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNext()) {
                String name = sc.nextLine();
                String[] member = name.split(" ");

                if (Integer.parseInt(member[1]) <= 0) {
                    throw new IOException();
                }

                members.add(new Person(member[0], Integer.parseInt(member[1])));

            }

            System.out.println(members);
            sc.close();

        } catch (
                FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (
                IOException e) {
            System.out.println("Некорректный входной файл");
        }

        return members;
    }
}