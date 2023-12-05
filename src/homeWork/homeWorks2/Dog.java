package homeWork.homeWorks2;

public class Dog {
    //Атрибуты
    String name;
    double weight;

    //Конструктор

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    //Сеттеры
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Геттеры
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}
