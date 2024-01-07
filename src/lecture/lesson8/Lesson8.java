package lecture.lesson8;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson8 {
    public static void main(String[] args) throws MyFirstException {
        int a = 10;
        int b = 2;
//        throwable
        try {
            if (b == 0) {
                throw new MyFirstException("Дружище, на 0 делить нельзя");
            }
            System.out.println(a / b);
        } catch (MyFirstException e) {
            System.out.println(MyFirstException.countExceptions);
        }

//        if (a == 10) {
//            throw new RuntimeException("Ой, это десятка");
//        }

        try {
            Integer add = Calc.add(1, 0);
        } catch (RuntimeException e) {
            System.out.println("Ой, а это рантайм ошибка");
        } catch (MyFirstException e) {
            System.out.println("Это моя первая ошибка");
            System.out.println(MyFirstException.getCountExceptions());
        } finally {
            System.out.println("Действие выполнится в любом случае");
        }

        try {
            doAdd(10, 5);
        } catch (NegativeNumberException | EvenNumberException e) {
            System.out.println(e.getMessage());
        }

        Integer integer = checkPositiveNumber(10);
    }

    //Может прибавлять только числа, которые положительные и четные
    public static int doAdd(int x, int y) throws NegativeNumberException, EvenNumberException {
        if (x <= 0 || y <= 0) {
            throw new NegativeNumberException("Ввели отрицательное число!");
        } if (x % 2 != 0 || y % 2 != 0) {
            throw new EvenNumberException("Числа не четные!");
        }
        return x + y;
    }


    public static Integer checkPositiveNumber(Integer number) {
        try {
            if (number > 0) {
                return number;
            }
            throw new RuntimeException("Ой");
        } finally {
            System.out.println("У меня выполнится этот код даже при return!");
        }

    }
}
