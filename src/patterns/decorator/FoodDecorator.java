package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 * this is the abstract class FoodDecorator which inherits from the FoodComp class
 * For the decorator is important that the constructor recieves a Composition as parameter
 */
public abstract class FoodDecorator extends FoodComp {

    protected FoodComp composition;

    public FoodDecorator(FoodComp composition) {
        this.composition = composition;
    }
}
