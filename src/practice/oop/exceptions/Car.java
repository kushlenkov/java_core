package practice.oop.exceptions;

public class Car {
    private boolean isBroken;

    public Car(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public void start() throws CarIsBrokenException {
        if (isBroken) {
            throw new CarIsBrokenException("Машина не работает");
        }
        System.out.println("Машина успешно стартовала");
    }
}
