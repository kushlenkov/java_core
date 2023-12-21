package practice.oop.inheritance.lesson9.task2;

public class Book {

    //Франция имеет 67_000_000 человек, французский язык, континент: Евразия
    //Аргентина имеет 47_000_000 человек, испанский язык, континент: Южная Америка
    //Италия имеет 58_000_000 человек, итальянский язык, континент: Евразия

    public static final Country FRANCE = new Country ("французский язык", "континент: Евразия", 67_000_000L);
    public static final Country ARGENTINA = new Country ("испанский язык", "континент: Южная Америка", 47_000_000L);
    public static final Country ITALY = new Country ("итальянский язык", "континент: Евразия", 58_000_000L);


    //Приватный конструктор. Нужен для того, чтобы никто не мог создать экземпляр класса Book
    private Book() {
    }
}
