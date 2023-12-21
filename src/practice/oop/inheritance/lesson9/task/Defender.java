package practice.oop.inheritance.lesson9.task;

public class Defender extends Human {

    public Defender(String gender) {
        super(gender);
    }

    @Override
    public void makeMoneyOnJob() {
        System.out.println("Охранник характерно сторожит и получает зарплату 15_000");
    }
}
