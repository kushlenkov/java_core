package practice.oop.basics.task;

public class Task {
    //Создать сеть ресторанов, которая обладает общими, для всех ресторанов, запасами продуктов: сосиски, хлеб.
    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок или хлеба не хватает, тогда вывести на экран: нет ингредиентов!
    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз!

    public static void main(String[] args) {
        Rest restOne = new Rest();
        Rest restTwo = new Rest();

        restOne.makeEat();
        restOne.chestInfo();
        restOne.addEat();
        restOne.chestInfo();
        restOne.makeEat();

        restTwo.makeEat();

        restOne.chestInfo();
        restOne.addEat();
        restOne.chestInfo();
    }
}
