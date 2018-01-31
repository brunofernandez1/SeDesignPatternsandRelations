package patterns.compositeabstract;

/**
 * Created by Bruno on 31.01.2018.
 * The component must be either an interface or an abstract class from whitch the composits and leafs can implement or extend
 * you have to choose what makes more sense
 */
public abstract class Component {
    public String name;
    public int price;
    public Component(String name, int price){
        this.name = name;
        this.price = price;
    }

    abstract int getPrice();

    abstract String getName();

}
