package day11.task1;

public class Picker implements Worker {

    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int countPickedOrders;

    public Picker(Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = false;
        this.warehouse = new Warehouse();
        this.countPickedOrders = 0;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    //За собранный заказ упаковщик получает зп 80,
    // количество упакованных заказов на складе увеличивается на 1
    @Override
    public void doWork() {
        salary += 80;
        countPickedOrders++;
        warehouse.setCountPickedOrders(countPickedOrders);
    }

    //бонус 70000 выплачивается  за первые 10000 упакованных заказав (условие 1)
    // только 1 раз (условие 2)
    @Override
    public void bonus() {
        if (Warehouse.getCountPickedOrders() == 10000 && !isPayed()) {
            salary += 70000;
            isPayed = true;
            System.out.println(this);
        } else if (Warehouse.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }

    @Override
    public String toString() {
        return "Упаковщик получил зарплату с премией: "
                + salary
                + " за "
                + countPickedOrders
                + " собранных заказов.";
    }
}
