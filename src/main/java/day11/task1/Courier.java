package day11.task1;

public class Courier implements Worker {

    private int salary;
    private boolean isPayed;
    private Warehouse warehouse;
    private int countDeliveredOrders;

    public Courier(Warehouse warehouse) {
        this.salary = salary;
        this.isPayed = false;
        this.warehouse = new Warehouse();
        this.countDeliveredOrders = 0;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    //За доставленный заказ курьер получает зп 100,
    // количество выполненных заказов на складе увеличивается на 1
    @Override
    public void doWork() {
        salary += 100;
        countDeliveredOrders++;
        warehouse.setCountDeliveredOrders(countDeliveredOrders);
    }

    //бонус 50000 выплачивается  за первые 10000 доставленных заказав (условие 1)
    // только 1 раз (условие 2)
    @Override
    public void bonus() {
        if (Warehouse.getCountDeliveredOrders() == 10000 && !isPayed()) {
            salary += 50000;
            isPayed = true;
            System.out.println(this);
        } else if (Warehouse.getCountDeliveredOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            System.out.println("Бонус уже был выплачен");
        }
    }

    @Override
    public String toString() {
        return "Курьер получил зарплату с премией: "
                + salary
                + " за "
                + countDeliveredOrders
                + " доставленных заказов.";
    }
}
