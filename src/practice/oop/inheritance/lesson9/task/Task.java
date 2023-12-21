package practice.oop.inheritance.lesson9.task;

public class Task {
    public static void main(String[] args) {

        //Мы создаем профессии на предприятии

        //Для охранника характерно умение сторожить. Зарплата 15_000 +

        //Для бухгалтера характерно считать налоги. Бухгалтер офисный работник. Зарплата 50_000 +
        //Для секретаря характерно печатать документы. Секретарь офисный работник. Зарплата 30_000 +
        //Каждый офисный работник умеет пить кофе. +

        //Каждый человек умеет получать зарплату(характерную для его профессии). +
        //У каждого человека есть пол. +

        //Воссоздать такую структуру в java.

        //Бухгалтер
        AccountingManager accountingManager = new AccountingManager("Girl");
        accountingManager.setGender("SuperGirl");
        System.out.println(accountingManager.getGender());
        accountingManager.drinkCoffee();
        accountingManager.makeMoneyOnJob();

        System.out.println("\n----------------------------------------------");

        //Секретарь
        Secretary secretary = new Secretary("Girl");
        secretary.setGender("SuperGirl");
        System.out.println(secretary.getGender());
        secretary.drinkCoffee();
        secretary.makeMoneyOnJob();

        System.out.println("\n----------------------------------------------");

        //Охранник
        Defender defender = new Defender("Man");
        defender.setGender("SuperMan");
        System.out.println(defender.getGender());
        defender.makeMoneyOnJob();

        Defender defender1 = new Defender("Man");

    }
}
