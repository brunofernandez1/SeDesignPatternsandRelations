package patterns.decorator;

/**
 * Created by Bruno on 31.01.2018.
 */
public class DecoratorTester {

    public static void main(String[] args) {

        //created a sandwitch with ketchup
        KetchupConcreteDecorator sandwitchWithKetcup = new KetchupConcreteDecorator(new SandwitchConcreteComp("firstsandwitch", 10));
        //total price should be 11=10+1
        System.out.println("Price " + sandwitchWithKetcup.getPrice());
        sandwitchWithKetcup.eat();

        System.out.println("");
        System.out.println("---");

        //added salami to the sandwitch
        SalamiConcreteDecorator andSalami = new SalamiConcreteDecorator(sandwitchWithKetcup);
        //total price should now be 13=10+1+2
        System.out.println("Price " + andSalami.getPrice());
        andSalami.eat();

        //now create a burger with the same decorators
        BurgerConcreteComp burgerWithKetchupandSalami = new BurgerConcreteComp("salambburger", 20);
        KetchupConcreteDecorator ketchup = new KetchupConcreteDecorator(burgerWithKetchupandSalami);
        SalamiConcreteDecorator salami = new SalamiConcreteDecorator(ketchup);

        System.out.println("");
        System.out.println("---");

        //total price should now be 23=20+1+2
        System.out.println("Price " + salami.getPrice());
        salami.eat();

    }
}
