package practice.oop.polymorphism.interfaces.task;

public class Duck extends Animal implements CanFly, CanSwim {

    @Override
    public void fly() {
        System.out.println("Утка летит");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает");
    }
}
