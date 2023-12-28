package practice.oop.polymorphism.interfaces.functional_intefaces;

public class Runner {
    public static void main(String[] args) {
        Sounding cat = new Cat(); //Полиморфизм: Sounding -> Cat
        cat.makeSound();
        Sounding bird = () -> System.out.println("Птица поет");
        bird.makeSound();
    }
}
