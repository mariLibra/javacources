package day19.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Neil Alishev
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/taxi_cars.txt");
        System.out.println("Введите координаты (целые числа от 0 до 99):");
        findTaxi(file);

    }

    public static Map<Integer, Point> getTaxiMap(File file) {
        Map<Integer, Point> taxi = new HashMap<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String[] autos = sc.nextLine().split(" ");

                int[] car = new int[autos.length];
                for (int i = 0; i < car.length; i++) {
                    car[i] = Integer.parseInt(autos[i]);
                }
                //отмечаем такси точкой на карте
                Point point = new Point(car[1], car[2]);
                //записываем id и координаты машины
                taxi.put(car[0], point);
            }
            sc.close();
            //System.out.println(taxi);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return taxi;
    }

    //определяем область для поиска по введенным координатам и количество доступных машин
    public static void findTaxi(File file) throws IOException {

        Scanner user = new Scanner(System.in);
        System.out.print("x1 ");
        int x1 = user.nextInt();
        System.out.print("y1 ");
        int y1 = user.nextInt();
        System.out.print("x2 ");
        int x2 = user.nextInt();
        System.out.print("y2 ");
        int y2 = user.nextInt();

        user.close();

        //проверка диапазона вводимых чисел
        int[] place = {x1, y1, x2, y2};
        for (int pl : place) {
            if (pl < 0 || pl > 99)
                throw new IOException();
        }

        //чтобы сократить условия проверки, делаем так,
        // чтобы прямоугольник всегда задавался нижней левой и правой верхней точками
        if (place[0] > place[2]) {
            int tmp = place[0];
            place[0] = place[2];
            place[2] = tmp;
        }
        if (place[1] > place[3]) {
            int tmp = place[1];
            place[1] = place[3];
            place[3] = tmp;
        }

        Map<Integer, Point> userTaxi = new HashMap<>(); //наш будущий список доступных такси

        Map<Integer, Point> taxi = getTaxiMap(file); //список всех такси

        for (Map.Entry<Integer, Point> entry : taxi.entrySet()) {

            if (entry.getValue().getX() > place[0] && entry.getValue().getX() < place[2] &&
                    entry.getValue().getY() > place[1] && entry.getValue().getY() < place[3]) {
                userTaxi.put(entry.getKey(), entry.getValue());
            }
        }
        System.out.println("Количество такси в заданной области: " + userTaxi.size());

        System.out.println(userTaxi.keySet());
    }
}
