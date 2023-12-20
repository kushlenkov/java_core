package practice.start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения)
        //ИСТИНА -> true -> да -> 1
        boolean answerArtur = true;
        //ЛОЖЪ -> false -> нет -> 0
        boolean answerPetr = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //людей на планете long
        //рук у человека byte - int
        //сигнал или нет boolean
        //стран в мире short/byte - int
        //жителей в монако int

        //Double - число с плавающей точкой, 64 bit
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 bit
        float cola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;
//        System.out.println(doubleNumber);
//        System.out.println(floatNumber);

        //Char - character (символ), 16 bit
        char letter = 70;
//        System.out.println(letter);

        char newLine = '\n';
        System.out.print("a");
        System.out.print(newLine);
        System.out.print("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);





    }
}
