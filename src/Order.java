public class Order {
    private String orderId;
    private String menuName;
    private double price;

    public Order(String orderId, String menuName, double price) {
        this.orderId = orderId;
        this.menuName = menuName;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
