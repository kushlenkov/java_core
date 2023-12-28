package practice.oop.polymorphism.interfaces.functional_intefaces;

@FunctionalInterface
public interface Sounding {
    void makeSound();
    default void doSomething() {
        System.out.println("Делаю что-то");
    }
}
