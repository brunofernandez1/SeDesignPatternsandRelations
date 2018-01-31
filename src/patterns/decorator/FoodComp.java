package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 * the composition can be either an abstract class or an interface
 * the concrete compositions & the abstract decorator class will inherit from this class
 */
public abstract class FoodComp {
    String name;
    int price;

    abstract void eat();
    abstract int getPrice();
}
