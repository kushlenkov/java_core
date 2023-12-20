package practice.oop.lesson7.practice;

public class Garage {
    private Car car1;
    private Car car2;

    {
        System.out.println("Гараж создан");
    }

    public Garage(Car car1, Car car2) {
        this.car1 = car1;
        this.car2 = car2;
    }

    public Garage() {
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    public void setCar2(Car car2) {
        this.car2 = car2;
    }

    //Cоздали сам метод
    private void getInfoCar(Car car) {
        System.out.println(car.getName());
        car.toOneHundred();
    }

    //Присвоили в метод: car1, car2
    public void getInfoCars() {
        getInfoCar(car1);
        getInfoCar(car2);
    }

}
