package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 *
 * This is the burgercomposition which inherits from the abstract FoodComp class
 */
public class BurgerConcreteComp extends FoodComp {

    public BurgerConcreteComp(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void eat() {
        System.out.print("eating burger with");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
