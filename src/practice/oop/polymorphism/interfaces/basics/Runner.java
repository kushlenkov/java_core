package practice.oop.polymorphism.interfaces.basics;

public class Runner {
    public static void main(String[] args) {
        Movable car = new Car();
        Dog dog = new Dog();
//        car.move();
//        dog.move();

        Movable[] movables = new Movable[2];
        movables[0] = car;
        movables[1] = dog;
        for (Movable movable : movables) {
            movable.move();
            movable.back();
        }

    }
}
