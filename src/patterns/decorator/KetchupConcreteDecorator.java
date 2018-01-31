package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 * this is the concrete decorator which extends from FoodDecorator
 * It has to use the FoodDecorator Constructor and abstract classed
 */
public class KetchupConcreteDecorator extends FoodDecorator {

    public KetchupConcreteDecorator(FoodComp composition) {
        super(composition);
    }

    //call also the eat method from the compositon to call the ecapsulated object
    @Override
    void eat() {
        composition.eat();
        System.out.print("ketchup,");
    }

    //call also the getPrice method from the compositon to call the ecapsulated object
    @Override
    int getPrice() {
        int pricesum = 1;
        return pricesum += composition.getPrice();

    }
}
