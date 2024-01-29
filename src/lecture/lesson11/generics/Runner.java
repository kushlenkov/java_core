package lecture.lesson11.generics;

public class Runner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Computer<Keyboard, Monitor> computer = new Computer<>(keyboard, monitor);
        Keyboard input = computer.getInput();
        input.exit();

        Mouse mouse = new Mouse();
        Tv tv = new Tv();
        Computer<Mouse, Tv> mouseComputer = new Computer<>(mouse, tv);
        mouseComputer.getInput().scroll();

        computer.getOutput().show();
        mouseComputer.getOutput().soundOff();
        
        Computer[] computers = {computer, mouseComputer};

    }
}
