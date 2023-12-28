package practice.oop.polymorphism.interfaces.basics;

public interface Movable {

    void move();

    default void back() {
        System.out.println("Возвращайся назад");
    }
}
