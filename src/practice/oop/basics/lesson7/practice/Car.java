package practice.oop.basics.lesson7.practice;

public class Car {

    //Атрибуты
    private String name;
    private int maxSpeed = 220;

    {
        System.out.println("Машина создана");
    }

    //Конструкторы

    //Со всеми атрибутами
    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    //Создать только с именем
    public Car(String name) {
        this.name = name;
    }

    //Создать пустой класс
    //Перезапись конструктора (подставить значения по умолчанию)
    public Car() {

    }

    //Сеттеры
    public void setName(String name) {
        this.name = name;
        System.out.println("Имя внесено");
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        System.out.println("Максимальная скорость внесена");
    }

    //Геттер
    public String getName() {
        return name;
    }

    //Метод - разгон до 100
    public void toOneHundred() {
       double toOneHundred = 110d / (maxSpeed / 20d);
        System.out.println("Скорость разгона до 100км/ч: " + toOneHundred); //в решении использовал printf ??
    }
}
