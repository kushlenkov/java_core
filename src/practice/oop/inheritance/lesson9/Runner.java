package practice.oop.inheritance.lesson9;

import practice.oop.inheritance.lesson9.dogs.Poodle;
import practice.oop.inheritance.lesson9.defend_dogs.Shepherd;
import practice.oop.inheritance.lesson9.dogs.Terier;

public class Runner {
    public static void main(String[] args) {

        //Пудель
        System.out.println("\nИнфо о пуделе");
        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);

        //Овчарка
        System.out.println("\nИнфо о овчарке");
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        System.out.println(shepherd.countTeeth);
        shepherd.beAngry();

        //Терьер
        System.out.println("\nИнфо о терьере");
        Terier terier = new Terier(40);
        System.out.println(terier.countTeeth);

    }
}
