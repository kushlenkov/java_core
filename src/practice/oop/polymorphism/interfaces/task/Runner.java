package practice.oop.polymorphism.interfaces.task;

public class Runner {
    public static void main(String[] args) {
        //Есть три класса:
        //Рыба - умеет плавать
        //Утка - умеет плавать и летать
        //Самолет - умеет летать
        //Создать по экземпляру каждого класса, создав интерфейсы
        //Закинуть плавающих в бассейн (в нем могут быть только те объекты, которые умеют плавать)
        //Отправить летающих в небо (в нем могут быть только те объекты, которые умеют летать)

        Jet jet = new Jet();
        Duck duck = new Duck();
        Fish fish = new Fish();

        CanFly[] sky = {duck, jet};
        for (CanFly flies : sky) {
            flies.fly();
        }
        CanSwim[] pool = {duck, fish};
        for (CanSwim swims : pool) {
            swims.swim();
        }
    }
}
