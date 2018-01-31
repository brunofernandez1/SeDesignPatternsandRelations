package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 * This is the Sandwitchcomposition which inherits from the abstract FoodComp class
 */
public class SandwitchConcreteComp extends FoodComp {

    public SandwitchConcreteComp(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void eat() {
        System.out.print("eating sandwitch with ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
