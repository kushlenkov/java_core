package practice.oop.inheritance.lesson9.dogs;

public class Poodle extends Dog {

    public Poodle() {
        super(36);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит медленно");
    }

    @Override
    public void breath() {
        System.out.println("Пудель дышит");
    }
}
