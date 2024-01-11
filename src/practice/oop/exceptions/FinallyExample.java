package practice.oop.exceptions;

public class FinallyExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Ой, ошибка");
        } finally {
            System.out.println(a/b);
            System.out.println("работаем дальше");
        }
    }
}
