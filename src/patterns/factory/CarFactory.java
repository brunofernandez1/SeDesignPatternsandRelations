package patterns.factory;

public class CarFactory {

    public CarAbstract getCar(String cartype) {
        if (cartype == "Porsche") {
            return new PorscheCarImpl("911", 500);
        } else if (cartype == "BMW") {
            return new BMWCarImpl("335i", 306);
        }
        return null;
    }
}