package patterns.factory;

public class FactoryTester {

    public static void main(String[] args) {
        //create factory object
        CarFactory carFactory = new CarFactory();

        //create a new BMW and Porsche with the carfactory
        CarAbstract firstcar = carFactory.getCar("Porsche");
        CarAbstract secondcar = carFactory.getCar("BMW");
        //CarAbstract thirdcar = carFactory.getCar("gugus");


        //now you should see that those are the correct object types
        firstcar.startEngine();
        secondcar.startEngine();
        //thirdcar.startEngine();

    }
}
