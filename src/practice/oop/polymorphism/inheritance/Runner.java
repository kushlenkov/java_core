package practice.oop.polymorphism.inheritance;

public class Runner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
//        cat.eat();
//        dog.eat();

//        dog.bark - не можем вызвать, т.к. dog - создан Animal (в котором нет bark)

        Animal[] animals = new Animal[2]; //так как оба Animal
        animals[0] = dog;
        animals[1] = cat;

//        for (Animal animal : animals) {
//            animal.eat();
//        }
        feedTwoAnimals(dog, cat);
    }

    public static void feedTwoAnimals(Animal animal1, Animal animal2) {
        animal1.eat();
        animal2.eat();
    }
}
