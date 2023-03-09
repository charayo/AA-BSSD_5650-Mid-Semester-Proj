import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.List;

public class MySubject {
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    //The subject registers listeners that want to know when its property changes
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.addPropertyChangeListener(listener);
    }


    //The subject removes listeners when needed.
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.pcs.removePropertyChangeListener(listener);
    }
    //The property that may change.
    private List<Order>value;
    //Getter for property.
    public List<Order> getValue () {
        return this.value;
    }
    //Setter for property which notifies listeners
    public void setValue (List<Order> newValue){
        List<Order> oldValue = this.value;
        this.value = newValue;
        this.pcs.firePropertyChange("foodOrder", oldValue, newValue);
    }
}
