package practice.oop.basics.task;

//Создать сеть ресторанов, которая обладает общими, для всех ресторанов, запасами продуктов: сосиски, хлеб.
public class Rest {
    //Запасы продуктов должны быть скрыты от чужих глаз! private
    private static int sausageCount = 0;
    private static int breadCount = 0;

    //Каждый ресторан может подать блюдо: тогда минус 1 сосиска и два куска хлеба из общего запаса.
    //Если сосисок или хлеба не хватает, тогда вывести на экран: нет ингредиентов!
    //Возможно, было бы корректнее, поменять местами действия if и else
    public void makeEat() {
        if (sausageCount < 1 && breadCount < 2) {
            System.out.println("Не хватает ингредиентов");
        } else {
            sausageCount--;
            breadCount -= 2;
            System.out.println("Ваше блюдо готово!" );
        }
    }

    //Каждый ресторан может принять партию товара: плюс 100 сосисок и 200 кусков хлеба.
    //Запасы продуктов должны быть скрыты от чужих глаз!
    public void addEat() {
        sausageCount += 100;
        breadCount += 200;
        System.out.println("Продукты добавлены");
    }

    public void chestInfo() {
        System.out.println("На складе сосисок: " + sausageCount);
        System.out.println("На складе хлеба : " + breadCount);
    }

}
