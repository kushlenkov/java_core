package practice.oop.exceptions;

public class CheckedExceptionExample {
    public static void main(String[] args) throws Exception {
            startCar(0);
        System.out.println("Едем за грибами");
    }

    public static void startCar(int fuel) throws Exception {
        checkFuel(fuel);
        System.out.println("Машина едет");
    }

    public static void checkFuel(int fuel) throws Exception {
        if (fuel <= 0) {
            throw new Exception("Ошибка, бензина нет");
        }
    }
}
