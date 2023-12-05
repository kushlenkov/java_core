package start.lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int x = 5;
        int y = x;
        x = 10;
        System.out.println(x);
        System.out.println(y);


//        int[] array = new int[2];
//        array[0] = x;
//        array[1] = y;
//        int [] array = new int[]{x, y};
//        int [] array = {x, y};
//        System.out.println(Arrays.toString(array));
//        //Вывод с индексом
//        System.out.println(array[1]);

        //Без инициализации
        int[] arrayNull = new int[10];
        System.out.println(Arrays.toString(arrayNull));


        int[] array = {x, y};
        int[] array2 = new int[2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[0] = 13;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        //Практическое задание
        //Столица Катара и записать в массив (какого-то типа)
        char[] answer = {'Д','о','х','а'};
        System.out.println(Arrays.toString(answer));


        //Строки
        String text = "Yuri";
        String text2 = text;
        text2 = text2 + " hello";
        System.out.println(text);
        System.out.println(text2);




    }
}


