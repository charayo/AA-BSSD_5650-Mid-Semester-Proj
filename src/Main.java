import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MySubject ms = new MySubject();
        // Here is where I get an instance of my order
        OrderListSingleton orderList = OrderListSingleton.getInstance();
        //Creating my menu
        IMenu burrito  = new Chicken(new BlackBeans(new BeanBurrito()));
        IMenu smallTacos = new Lemonade(new PapasTacosFilling(new Tacos()));



        Order order1 = new Order("0", burrito.getDescription(), burrito.getPrice());
        Order order2 = new Order("1", smallTacos.getDescription(), smallTacos.getPrice());

        // Add the order to the list
        orderList.addOrder(order1);
        orderList.addOrder(order2);

        // Get the list of orders
        ArrayList<Order> orders = orderList.getOrders();
        ms.addPropertyChangeListener(new Customer());
        // Iterate over the orders and print them
        double totalCost = 0.0;
        System.out.println("--------------------------------------------------------------------------------------------------");
            for (Order order : orders) {
                totalCost += order.getPrice();
                System.out.println("Order ID: " + order.getOrderId() + ", Product Name: " + order.getMenuName() + ", Price: " + order.getPrice());

            }
        System.out.println("Order Total Cost: " + totalCost);
        System.out.println("--------------------------------------------------------------------------------------------------");
        ms.setValue(orders);
    }
}