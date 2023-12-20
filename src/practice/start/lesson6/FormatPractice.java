package practice.start.lesson6;

public class FormatPractice {
    public static void main(String[] args) {
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.00;
        boolean hasAutomaticTransmission = false;
        //Задача: С помощью String format составить строку:
        //Привет, я менеджер салона [Имя бренда]
        //У нас есть модель - [Имя модели] за [Цена]
        //Есть ли у нее автоматическая коробка передач?
        //[Да/Нет]

//        //Мое решение
//        System.out.printf("Привет, я менеджер салона %s. У нас есть модель %s за %f.\nЕсть ли у нее автоматическая коробка передач?", carMark, carModel, price);
//
//        if (hasAutomaticTransmission == true) {
//            System.out.println("\nДа");
//        } else {
//            System.out.println("\nНет");
//        }

        String result = """
                Привет, я менеджер салона %s
                У нас есть модель -  %s за %f
                Есть ли у нее автоматическая коробка передач?
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
        System.out.println(result);

    }
}
