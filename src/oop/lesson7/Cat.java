package oop.lesson7;

import java.util.Arrays;

public class Cat {
    //Атрибут (свойство объекта, поле)
    //Модификаторы доступа private public default (по умолчанию всегда default)
    //Программисты договорились писать всегда private и всегда использовать get и set
    public String color;
    double weight;
     String ownerName;

    //Конструктор
    public Cat(String colorName, double weightCat, String owner) {
        this.color = colorName;
        this.weight = weightCat;
        this.ownerName = owner;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s.\n", sofaOwner);
    }

    public String hunt (boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";
    }

    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    //varArgs ... можно указывать только в конце (последний аргумент в методе)
    //т.к. может включать в себя бесконечное число аргументов
    public void feed(String giver, String ...product) {
        System.out.printf("Человек %s дает коту : %s", giver, Arrays.toString(product));
    }

    //Перегрузка  (overloading) метода hunt
    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Утро")) {
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    //Перезапись метода
    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
