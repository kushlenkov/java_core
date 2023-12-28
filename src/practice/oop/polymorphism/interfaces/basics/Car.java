package practice.oop.polymorphism.interfaces.basics;

public class Car implements Movable {

    public void move() {
        System.out.println("Машина едет");
    }

    //Не сможем вызвать, если создадим Movable car
    public void turnOff() {
        System.out.println("Машина выключилась");
    }

    @Override
    public void back() {
        System.out.println("Машина возвращается назад");
    }
}

