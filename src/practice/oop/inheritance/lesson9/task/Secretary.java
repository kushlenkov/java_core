package practice.oop.inheritance.lesson9.task;

public class Secretary extends OfficeWorker {

    public Secretary(String gender) {
        super(gender);
    }

    @Override
    public void makeMoneyOnJob() {
        System.out.println("Секретарь характерно печатает документы.Получает зарплату 30_000");
    }
}
