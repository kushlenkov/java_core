package practice.oop.polymorphism.interfaces.interface_inheritance;

public interface Movable {
    void move();

    default void eat() {
        System.out.println("Движущийся объект ест");
    }
}
