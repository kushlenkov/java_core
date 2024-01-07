package practice.oop.nested_classes;

public class Runner {
    public static void main(String[] args) {

        //Вложенный статический класс
        Human human = new Human("23aa",
                "333224b", PassportType.FOREIGN, 280.0);
        System.out.println(human);

        //Вложенный не статический класс (используется крайне редко, это не очень удобно)


    }
}
