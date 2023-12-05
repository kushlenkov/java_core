package homeWork;

public class Tests {
    public static void main(String[] args) {
        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = -0.01123;
        double result = 0;
        long count = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        while (result < 1_000_000) {
            count++;
            result += increment;
            if (result < 0)
            break;
        }
        if (result > 0) {
            System.out.println(count);
        }
    }
}
