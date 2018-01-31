package patterns.compositeabstract;

/**
 * Created by Bruno on 31.01.2018.
 */
//composit inerhit from Component
public class Leaf extends Component {

    //use the constructor of the Component class
    public Leaf(String name, int price) {
        super(name, price);
    }

    //here you just have to return your leaf price
    @Override
    int getPrice() {
        return price;
    }

    //here you just have to return your leaf name
    @Override
    String getName() {
        return name;
    }

}
