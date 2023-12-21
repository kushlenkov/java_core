package practice.oop.basics.lesson8;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
//        System.out.println(Car.countCars);
         Car audi = new Car("audi");
         Car bmw = new Car("bmw");
        System.out.println("Количество машин: " + Car.countCars);
//
//        Car.printBrands();
//        System.out.println(Car.BMW_INFO);
//
//        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));

        //Пример возможности изменения final
        Car.BRAND_DESCRIPTIONS[0] = "Любое значение";
        System.out.println(Arrays.toString(Car.BRAND_DESCRIPTIONS));

    }
}
