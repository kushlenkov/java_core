package practice.oop.inheritance.lesson9.task;

public abstract class OfficeWorker extends Human {

    public OfficeWorker(String gender) {
        super(gender);
    }

    public void drinkCoffee() {
    System.out.println("Сотрудник офиса пьет кофе");
    }

}
