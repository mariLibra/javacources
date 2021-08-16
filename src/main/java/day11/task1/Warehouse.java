package day11.task1;

public class Warehouse {

    private static int countPickedOrders;
    private static int countDeliveredOrders;

    public static int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public static int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Собрано " + countPickedOrders
                + " заказов, доставлено " + countDeliveredOrders + " заказов.";
    }
}
