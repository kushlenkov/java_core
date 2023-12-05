package homeWork.homeWorks2;

public class HomeWork2 {
    public static void main(String[] args) {
        //Базовый
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        String textFormatted = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(textFormatted.repeat(3));

        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а

        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }

        System.out.print(newLine);

        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака
        Cat Cat1 = new Cat("Перс", 15);
        Cat1.setModel("ПолуПерсПолуЧерт");
        Cat1.setAge(14);
        System.out.println(Cat1.getModel() + " " + Cat1.getAge());

        Dog Dog1 = new Dog ("Пес", 75.5);
        Dog1.setName("НеПес");
        System.out.println(Dog1.getName() + " " + Dog1.getWeight());


        //Продвинутый
        System.out.println("-----------------------------------------------------");
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        long count = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        //Доработал ответ, чтобы выполнялось условие с отрицательным числом
        while (result < 1_000_000) {
            count++;
            result += increment;
            if (result < 0)
                break;
        }
        if (result > 0) {
            System.out.println(count);
        }

//        Ответ
//        while (result < 1_000_000) {
//            result += increment;
//            count ++;
//        }
//        System.out.println(count);

        //Мое решение - бесконечный цикл, если значение инкремента отрицательное)
//        do {
////            System.out.println(result);
//            result += increment;
//            count ++;
//        } while (result < 1_000_000);
//        System.out.println(count);

    }
}

