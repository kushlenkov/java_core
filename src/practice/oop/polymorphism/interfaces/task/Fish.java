package practice.oop.polymorphism.interfaces.task;

public class Fish extends Animal implements CanSwim {

    @Override
    public void swim() {
        System.out.println("Рыба плавает");
    }
}
