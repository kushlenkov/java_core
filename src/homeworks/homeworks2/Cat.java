package homeworks.homeworks2;

public class Cat {
    //Атрибуты
    String model;
    int age;


//    //Конструктор

    public Cat(String model, int age) {
        this.model = model;
        this.age = age;
    }

    //Сеттеры
    public void setModel(String model) {
        this.model = model;
        System.out.println("Внесено изменение в model");
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Внесено изменение в age");
    }

    //Геттеры
    public String getModel() {
        return "Модель кота " + model;
    }

    public int getAge() {
        return age;
    }
}
