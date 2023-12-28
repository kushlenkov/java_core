package practice.oop.polymorphism.interfaces.functional_intefaces;

public class Cat implements Sounding {
    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает");
    }
}
