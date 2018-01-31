package patterns.factory;

public class BMWCarImpl extends CarAbstract {
    BMWCarImpl(String name, int power) {
        super(name, power);
    }

    @Override
    void startEngine() {
        System.out.println("starting engine of BMW with "+power +" PS");

    }
}
