package practice.oop.exceptions;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;


        try {
            int[] ints = new int[2];
            System.out.println(ints[3]);

            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Ой, произошла ошибка связанная с делением:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ой, произошла ошибка связанная с массивом:" + e.getMessage());
        }



        System.out.println("программа работает дальше");
    }
}
