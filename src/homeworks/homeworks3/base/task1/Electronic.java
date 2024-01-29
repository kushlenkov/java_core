package homeworks.homeworks3.base.task1;

public abstract class  Electronic {

    // 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
    // подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)

    private boolean isOn = false;

    public void on() {
        this.isOn = true;
        System.out.println("Включает электрический прибор");
    }

    public void off() {
        this.isOn = false;
        System.out.println("Выключает электрический прибор");
    }

    public abstract void work();
}
