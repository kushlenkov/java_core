package homeWorks.homeWorks4.base;

public class Jet implements Flyable {
    private int countPassengers;

    public Jet(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void canFly() throws FlyException {
        if (countPassengers <= 0) {
            throw new FlyException("Ошибка: Пассажиров меньше одного");
        } else {
            System.out.println("Самолет летит");
            System.out.println("Какие-то действия");
        }
    }
}
