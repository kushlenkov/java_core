package homeWork.homeWorks3.base.task1;

public class Computer extends Electronic {

    // 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")

    public void loadSystem() {
        System.out.println("загрузка компьютера");
    }

    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }
}
