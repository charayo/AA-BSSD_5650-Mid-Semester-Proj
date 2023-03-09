import java.util.ArrayList;


public class OrderListSingleton {

    private static OrderListSingleton instance;
    private ArrayList<Order> orders;

    private OrderListSingleton() {
        this.orders = new ArrayList<>();
    }

    public static OrderListSingleton getInstance() {
        if (instance == null) {
            instance = new OrderListSingleton();
        }
        return instance;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}

