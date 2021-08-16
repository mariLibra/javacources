package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Picker picker1 = new Picker(wh1);
        Courier courier1 = new Courier(wh1);

        businessProcess(picker1);
        businessProcess(courier1);

        Warehouse wh2 = new Warehouse();
        Picker picker2 = new Picker(wh2);
        Courier courier2 = new Courier(wh2);

        businessProcess(picker2);
        businessProcess(courier2);

        System.out.println(wh1);
        System.out.println(wh2);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
