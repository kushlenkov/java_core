package lecture.lesson7;

import java.util.Arrays;

public class Lesson7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fish fish = new Fish("Yaz", 3, Country.FRANCE);
        System.out.println(fish.toString());
        Fish fish2 = new Fish("Okyn'", 1, Country.RUSSIA);

        Class<? extends Fish> fishClass = fish.getClass(); //Generic
        System.out.println(fishClass.getSuperclass().getName());
        Fish fish3 = new Fish("Yaz", 10, Country.FRANCE);

        System.out.println(fish.hashCode());
        System.out.println(fish2.hashCode());
        System.out.println(fish3.hashCode());

        boolean equals = fish.equals(fish2);
        System.out.println(equals);

        Fish clone = (Fish) fish.clone();
        System.out.println(clone == fish); //Разные объекты

        Country france = Country.FRANCE;
        boolean isCountryEquals = fish.getCountry() == fish2.getCountry();
        System.out.println(isCountryEquals);
        System.out.println(fish.getCountry());

        Country[] values = Country.values();
        System.out.println(Arrays.toString(values));

        Country france1 = Country.valueOf("FRANCE");
        System.out.println(france1.ordinal());

    }
}
