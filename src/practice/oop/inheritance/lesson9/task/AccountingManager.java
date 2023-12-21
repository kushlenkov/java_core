package practice.oop.inheritance.lesson9.task;

public class AccountingManager extends OfficeWorker {

    public AccountingManager(String gender) {
        super(gender);
    }

    @Override
    public void makeMoneyOnJob() {
        System.out.println("Бухгалтер характерно считает налоги. Получает зарплату 50_000");
    }
}
