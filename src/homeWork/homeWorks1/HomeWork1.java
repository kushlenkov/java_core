package homeWork.homeWorks1;

public class HomeWork1 {
    public static void main(String[] args) {
        //Базовая домашка
        //Задача №1
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.00202130120

        //Решал

        // Задание №2
        // Дано:
        int ageChildren = 22;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка,
        // отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад,
        // если до 11 лет в младшую школу,
        // если до 17 лет в среднюю школу,
        // иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел в сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        if  (ageChildren < 6) {
            System.out.println("Ребёнок идёт в сад.");
        } else if (ageChildren < 11) {
            System.out.println("Ребёнок идёт в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Ребёнок идёт в среднюю школу");
            } else {
            System.out.println("Ребёнок идёт в университет");
        }

        // Задание №3
        // Дано:

        //Курица
        boolean chicken = true;
        //Овощи
        boolean vegetables = true;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = true;
        //Яйца
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.

        boolean caesar = chicken && vegetables && sour && toast;
        boolean olivie = vegetables &&  eggs && (sausage || chicken);

        if (caesar) {
            System.out.println("Повар делает Цезарь");
        } else if (olivie) {
            System.out.println("Повар делает Оливье");
        } else if (vegetables) {
            System.out.println("Повар делает овощной салат");
        } else {
            System.out.print("У меня ничего нет");
        }


        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String numberText = "234";
        int number = Integer.parseInt(numberText);
        String someText = "some_Text";
        System.out.println(number + someText.length());



        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5

        int a = 3;
        int b = 5;
        int resul = (a + b) * (a + b);
        System.out.println(resul);

        System.out.println("-----------------");
        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = true;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = false;
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Скидки суммируются.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.

        //Тут была ошибка: заменил && на ||
        boolean hasAnyProblem = hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem;

        double price = 0;
        double discount = 1;
        int countProblems = 0;

        if (!hasFuel && !hasAnyProblem) {
            price += 1_000;
            System.out.println("Нет бензина, за консультацию с вас = " + price);
        } else if (hasFuel){
            System.out.println("Бензин есть");
        } else {
            System.out.println("Нет бензина");
        }

         if (hasMotorProblem) {
            price += 10_000;
            countProblems ++;
            System.out.println("Проблемы с мотором. Чинят и берут 10 000");
        }
         if (hasElectricsProblem) {
            price += 5_000;
            countProblems ++;
            System.out.println("Проблемы с электрикой. Чинят и берут 5 000");
        }
         if (hasTransmissionProblem) {
             price += 4_000;
             countProblems ++;
             System.out.println("Проблемы с трансмиссией. Чинят и берут 4 000");
         } if (hasWheelsProblem) {
             price += 2_000;
             countProblems ++;
             System.out.println("Проблемы с колесами. Чинят и берут 2 000");
         }

         if (countProblems == 2) {
             discount -= 0.1;
        }
         if (hasTransmissionProblem && (hasMotorProblem || hasElectricsProblem)) {
             discount -= 0.2;
        }

        System.out.println("Итого с Вас : " + price);
        System.out.println("Скидка : " + discount);

         price = price * discount;
        System.out.println("Итого с Вас со скидкой : " + price);

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
        // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder

        //Пока не готов
    }
}
