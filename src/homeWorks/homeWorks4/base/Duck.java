package homeWorks.homeWorks4.base;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void canFly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: Утка подстрелена");
        } else {
            System.out.println("Утка летит");
        }
        System.out.println("Какие-то действия");
    }
}
