package lecture.lesson11.generics;

public class Keyboard implements Input {
    @Override
    public void input() {
        System.out.println("Ввод с клавиатуры");
    }

    public void exit() {
        System.out.println("Нажали ctrl alt del");
    }
}
