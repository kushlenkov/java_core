package practice.oop.lesson7;

import practice.oop.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
//        Cat cat = new Cat("Black", 10, "Petr");



//        System.out.println(cat.color);
//        System.out.println(cat.ownerName);
//        System.out.println(cat.weight);
//        cat.color = "Red";
//        System.out.println(cat.color);
//
//        cat.destroySofa("Петра");
//        String animal = cat.hunt(false);
//        String resultHunt2 = cat.hunt(false, false);
//        cat.hunt("Утро");
//        System.out.println(resultHunt2);
//
//        cat.feed("Антон","Рыбу", "Корм", "Вода");

        Dog dog = new Dog("Мухтар", -10, "Петр");
//        System.out.println(dog);
//        dog.setWeight(-1);
//        System.out.println(dog);
//
//        System.out.println(dog.getOwner());
//
//        Dog dog2 = new Dog();
//        System.out.println(dog2);


//      Dependency injection зависимость методов класса от экземпляров другого класса
        Cat cat = new Cat("Черный", 10, "Yuri");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
