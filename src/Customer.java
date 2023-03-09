import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

public class Customer implements PropertyChangeListener {


    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        List<Order> orders = (List<Order>)evt.getNewValue();
        StringBuilder message = new StringBuilder("Processing Order: ");
//        for (Order order : orders) {
//           message.append(order.getMenuName());
//        }
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if(i > 0 ){
                message.append(" and (").append(order.getMenuName()).append(")");
            }else{
                message.append("(").append(order.getMenuName()).append(")");
            }

        }
        System.out.println("Message from Taco Bells: ");
        System.out.println( message);
    }
}
