package practice.oop.polymorphism.interfaces.task;

public class Jet implements CanFly {

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
