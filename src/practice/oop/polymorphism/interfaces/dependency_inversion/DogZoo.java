package practice.oop.polymorphism.interfaces.dependency_inversion;

public class DogZoo {
    private Dog dog1;
    private Dog dog2;


    //Конструктор для любого типа собак
    public DogZoo(Dog dog1, Dog dog2) {
        System.out.println("Конструктор на любую собаку");
        this.dog1 = dog1;
        this.dog2 = dog2;
    }

    //Только пудель и овчарка
    public DogZoo(Poodle poodle, Shepherd shepherd) {
        System.out.println("Конструктор для пуделя и овчарки");
        this.dog1 = poodle;
        this.dog2 = shepherd;
    }
}
