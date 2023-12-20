package practice.oop.lesson7;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Anton";

    //Блок инициализации
    {
        System.out.println("Собака создалась!");
    }

    //Перезапись конструктора (подставить значения по умолчанию)
    public Dog() {
    }

    //Конструктор
    public Dog(String name, int weight, String owner) {
        if (weight < 1) {
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    //varArgs ... можно указывать только в конце (последний аргумент в методе)
    //т.к. может включать в себя бесконечное число аргументов
    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает собака : %s\n", giver, Arrays.toString(product));
    }

    public void setWeight(int newWeight) {
        if (newWeight < 1) {
            this.weight = 5;
        } else {
            this.weight = newWeight;
        }
    }

    public String getOwner() {
        return "Mr. " + owner;
    }

    //Переопределили метод, чтобы при печати было видно инфу о собаке
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
