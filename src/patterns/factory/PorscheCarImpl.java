package patterns.factory;

public class PorscheCarImpl extends CarAbstract {

    PorscheCarImpl(String name, int power) {
        super(name, power);
    }

    @Override
    void startEngine() {
        System.out.println("starting engine of porsche with "+power +" PS");
    }
}
