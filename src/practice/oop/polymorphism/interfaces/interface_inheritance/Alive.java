package practice.oop.polymorphism.interfaces.interface_inheritance;

public interface Alive extends Eatable, Movable{
    @Override
    default void eat() {
        Movable.super.eat();
    }
}
