package practice.start.lesson4;

public class Practice {
    public static void main(String[] args) {
        //Практическое задание
        //Проверить работоспособность машины: двигатель(Engine) и трансмиссия(Transmission) - работают,
        //и хотя бы 3 колеса из 4 не проколоты
        //Если машина работоспособна - вывести на экран - машина готова к эксплуатации
        //Если машина НЕработоспособна - вывести на экран - машина сломана
        boolean isWorkEngine = true;
        boolean isWorkTransmission = true;
        boolean isFineWheel1 = true;
        boolean isFineWheel2 = false;
        boolean isFineWheel3 = true;
        boolean isFineWheel4 = true;
        int CountFineWheels = 0;

        //двигатель + трансмиссия
        boolean isWorkEngineAndTransmission = isWorkEngine && isWorkTransmission;

        if (isWorkEngine && isWorkTransmission) {
            System.out.println("Двигатель и трансмиссия исправны");
        } else if (isWorkEngine) {
            System.out.println("Двигатель исправен, трансмиссия - нет");
        } else if (isWorkTransmission) {
            System.out.println("Трансмиссия исправна, двигатель - нет");
        } else {
            System.out.println("Двигатель и трансмиссия не исправны");
        }

        //Колеса

        CountFineWheels += isFineWheel1 ? 1 : 0;
        CountFineWheels += isFineWheel2 ? 1 : 0;
        CountFineWheels += isFineWheel3 ? 1 : 0;
        CountFineWheels += isFineWheel4 ? 1 : 0;

        System.out.println("К-во исправных колес = " + CountFineWheels);

        //Общая информация о готовности

        if (isWorkEngine && isWorkTransmission && (CountFineWheels >= 3)) {
            System.out.println("Машина готова к эксплуатации");
        } else  {
            System.out.println("Машина сломана");
        }
    }
}
