package practice.oop.basics.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    public static int countCars = 0;
    public final static String BMW_INFO = "BMW - немецкая компания, основанная в 1928 году";
    public final static String AUDI_INFO = "AUDI - немецкая компания, основанная в 1933 году";
    public final static String KIA_INFO = "KIA - корейская компания, основанная в 1978 году";
    public final static String[] BRAND_DESCRIPTIONS = new String[3];

    static {
        BRAND_DESCRIPTIONS[0] = BMW_INFO;
        BRAND_DESCRIPTIONS[1] = AUDI_INFO;
        BRAND_DESCRIPTIONS[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTIONS));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrands() {
        System.out.println("Перечень доступных брендов: bmw, audi, kia");
    }
}
