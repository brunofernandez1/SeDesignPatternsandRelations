package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 * this is the concrete decorator which extends from FoodDecorator
 * It has to use the FoodDecorator Constructor and abstract classed
 */
public class SalamiConcreteDecorator extends FoodDecorator {

    public SalamiConcreteDecorator(FoodComp composition) {
        super(composition);
    }

    //call also the eat method from the compositon to call the ecapsulated object
    @Override
    void eat() {
        composition.eat();
        System.out.print("Salami,");
    }

    //call also the getPrice method from the compositon to call the ecapsulated object
    @Override
    int getPrice() {
        int pricesum = 2;
        return pricesum += composition.getPrice();
    }
}
