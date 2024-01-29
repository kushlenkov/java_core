package lecture.lesson11.generics;

public class Mouse implements Input {
    @Override
    public void input() {
        System.out.println("Вводы с мыши");
    }

    public void scroll() {
        System.out.println("Прокрутка");
    }
}
