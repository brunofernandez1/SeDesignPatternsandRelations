package patterns.compositeabstract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bruno on 31.01.2018.
 */
//composit inerhit from Component
public class Composit extends Component {

    //in the list you save all leafs or even more composits
    List<Component> components = new ArrayList<>();

    //use the constructor of the Component class
    public Composit(String name, int price) {
        super(name, price);
    }

    //get the price of this object and all other objects in the list
    @Override
    int getPrice() {
        int sum = price;
        for (Component c : components){
            sum += c.getPrice();
        }
        return sum;
    }

    //just return the composit name
    @Override
    String getName() {
        return this.name;
    }

    //add components to the composit list
    void addComponent(Component component) {
        components.add(component);
    }
}
