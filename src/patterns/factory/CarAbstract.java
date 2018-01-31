package patterns.factory;

abstract class CarAbstract {

    String name;
    int power;

    CarAbstract(String name, int power){
        this.name = name;
        this.power = power;
    }

    abstract void startEngine();
}
