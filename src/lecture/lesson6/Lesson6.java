package lecture.lesson6;

import homeWorks.Tests;

public class Lesson6 {
    public static void main(String[] args) {
        //animalExample();
        //defenderExample();
        humanExample();
        Tests.main(new String[0]); //Вызов любого урока
    }

    public static void humanExample() {
        Human petr = new Human("Petr");
        Human yuri = new Human("Yuri");
        System.out.println(petr);

        petr.hello();
        Human.hello();
    }

    public static void defenderExample() {
        Dog muhtar = new Dog("Muhtar", 4);
        Robot robot = new Robot();

        Defendable[] defendables = {muhtar, robot};
        for (Defendable defendable : defendables) {
            defendable.defend();
            defendable.attack();
        }
    }

    public static void animalExample() {
        //Animal - для того чтобы можно было объединить в один массив
        Animal cat = new Cat("Barsic");
        Dog dog = new Dog("Muhtar", 4);

        Animal dog2 = dog;
        //Это называется каст. Преобразовали Dog dog в Animal dog2 к типу других данных
        //Переменная dog2 хранит в себе ссылку на объект
        //Нет преобразования данных, но можем пользоваться методами, атрибутами Dog
        //Пример:
        dog.defend();
        dog.countLegs = 3; //Из класса Dog
        System.out.println(dog); //Ссылка на один объект
        System.out.println(dog2);
        System.out.println(dog2.getClass()); //Узнать класс

//        cat.makeSound();
//        dog.makeSound();

        Animal[] zoo = {cat, dog};
        for (Animal animal : zoo) {
            if (animal instanceof Dog) { //Проверка класса (true / false)
                ((Dog) animal).defend();
            }
            animal.makeSound();
        }
    }

}