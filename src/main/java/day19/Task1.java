package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File text = new File("target/classes/dushi.txt");
        try {
            Scanner sc = new Scanner(text);

            sc.useDelimiter("[.,:;()?!\"\\s-–«»“„…<>]+"); // добавила еще несколько знаков препинания

            Map<String, Integer> dushi = new HashMap<>();

            while (sc.hasNext()) {
                String str = sc.next().toLowerCase(); //все слова делаю со строчных букв, чтобы не было дублирования слов

                //если слово еще ни разу не встречалось
                if (dushi.get(str) == null) {
                    dushi.put(str, 1);

                } else {
                    int value = dushi.get(str) + 1;
                    dushi.put(str, value);
                }
            }
            sc.close();

            //общий список слов и частота их использования
            System.out.println(dushi);

            //проверяю, сколько раз в тексте встречается фамилия "Чичиков"
            System.out.println("Чичиков = " + dushi.get("чичиков"));

            //100 самых часто встречающихся слов в тексте
            System.out.println(getPopular(dushi, 100));


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static Map<String, Integer> getPopular(Map<String, Integer> quelle, int number) {

        //временный список, чтобы не изменять исходный список
        Map<String, Integer> tmp = new HashMap<>(quelle);

        //конечный список с популярными словами
        Map<String, Integer> popular = new HashMap<>();

        for (int i = 0; i < number; i++) {
            int value = 1;
            String key = "";

            for (Map.Entry<String, Integer> entry : tmp.entrySet()) {
                if (entry.getValue() > value) {
                    value = entry.getValue();
                    key = entry.getKey();
                }
            }
            popular.put(key, value);

            //удаляю значение с ключом key,
            // чтобы найти следующее максимальное значение value
            tmp.remove(key);
        }
        return popular;
    }
}
