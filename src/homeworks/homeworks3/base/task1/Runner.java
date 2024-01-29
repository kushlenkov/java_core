package homeworks.homeworks3.base.task1;

public class Runner {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.on();
        computer.loadSystem();
        computer.work();
        computer.off();

        LenovoComputer lenovoComputer = new LenovoComputer();
        lenovoComputer.on();
        lenovoComputer.loadSystem();
        lenovoComputer.work();
        lenovoComputer.off();
    }
}
