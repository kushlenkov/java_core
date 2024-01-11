package practice.oop.exceptions;

public class Runner {
    public static void main(String[] args) throws CarIsBrokenException {
        Car car = new Car(true);
        car.start();
    }
}
