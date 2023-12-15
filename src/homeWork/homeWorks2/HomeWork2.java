package homeWork.homeWorks2;

import start.lesson5.Array;

import java.util.Arrays;

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

//        Ответ (тоже не работает с отрицательным числом)
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

        System.out.println("-----------------------------------------------------");

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] array = {1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------------------------------");

        //Задача №3
        //Создать два массива чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers1 = {1, 2, 5, 7, 10};
        int[] numbers2 = {2, 3, 2, 17, 15};
        int[] numbers3 = new int[numbers1.length * 3];
        System.out.println(Arrays.toString(numbers3)); //Изучал массив 3
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
            numbers3[i + 5] = numbers2[i];
            numbers3[i + 10] = numbers1[i] * numbers2[i];
        }
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        //Сам не смогу решить
        System.out.println(Arrays.toString(numbers3));

        System.out.println("-----------------------------------------------------");

        //Задача №4
        //В строке "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String HW = "Hello world!";
        String HWver2 = HW.replace("l", "r").toUpperCase().substring(0, 8);
        System.out.println(HWver2);
        
    }
}

