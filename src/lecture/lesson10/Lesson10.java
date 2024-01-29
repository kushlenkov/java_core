package lecture.lesson10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

public class Lesson10 {
    public static void main(String[] args) {
        Car.Wheel wheel = new Car.Wheel(true);
        Car car = new Car(20_000);
        Car.Engine engine = car.new Engine(5.0);

        List<Integer> integers = List.of(1, 2, 3, 4);
        integers.stream().map((e) -> e * 3);

        //Анонимный классы
        Move human = new Move() {
            @Override
            public void move() {
                System.out.println("Человек идет");
            }
        };

        Move airplane = new Move() {
            @Override
            public void move() {
                System.out.println("Самолет летит");
            }
        };
        
        airplane.move();
        human.move();
        Move[] moves = {human, airplane};
        car.takeMove(human);
        car.takeMove(airplane);

        String firstLetter = StringUtilClass.getFirstLetterFromName("Артур");
        System.out.println(firstLetter);

        //Работа с датой
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDate2 = localDate.plus(30, ChronoUnit.DAYS);
        System.out.println(localDate2);

        System.out.println(isSecondDateAfterFirstDate(localDate, localDate2));

        //Работа со временем
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        Лучше не использовать класс Date, т.к. устарел + не учитывает локацию
//        new Date() - отстой

    }

    public static boolean isSecondDateAfterFirstDate(LocalDate first, LocalDate second) {
        if (first != null && second != null) {
            return second.isAfter(first);
        }
        throw new RuntimeException("Одна из дат = null");
    }

}
