package start.lesson3;

public class MathOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        //Прибавление
        int sum = x + y;
//        System.out.println(sum);

        //Вычитание
        int diff = x - y;
//        System.out.println(diff);

        //Умножение
        int multiply = x * y;
//        System.out.println(multiply);

        //Деление
        y = 3;
        double divide = (double) x / y;
//        System.out.println(divide);

        int ext = x * x;
//        System.out.println(ext);

        //Инкремент
//        x = x + 1;
//        x++;

//        System.out.println(x);

        //Сокращенная форма записи
//        x += 10;
//        x *= 10;
//        x /= 2;

        //Декремент

//        x = x - 1;
//        x--;
//        System.out.println(x);

        //Остаток от деления
        int number = 4;
        // 4 - 2 - 2 = 0
        // 5 - 2 - 2 = 1
        // 7 - 3 - 3 = 1
        int moodulo = number % 3;
//        System.out.println(moodulo);

        //Скобки
        int z = (2 + 2) * 2;
//        System.out.println(z);

        //Задание рост вес идекс массы тела
        double height = 1.86;
        int weight = 84;
        double index = weight / (height * height);
        System.out.println(index);


    }
}
