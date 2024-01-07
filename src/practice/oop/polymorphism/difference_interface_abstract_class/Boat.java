package practice.oop.polymorphism.difference_interface_abstract_class;

public class Boat implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Лодка плывет");
    }
}
