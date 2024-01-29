package lecture.lesson11.list;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        //Лист в Лист
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());

        //Добавить
        integers.add(2);
        integers.add(0, 3);

        //Удалить
        integers.remove(new Integer(2));

        //Содержит ли?
        boolean contains = integers.contains(3);
        System.out.println(contains);

        //Выдать элемент по индексу
        Integer integer = integers.get(0);

        //Создание иммутабельного(нельзя редактировать?) Листа со значениями
        List<Integer> integers1 = List.of(1, 3, 5);

        //Добавление значений из одного листа в другой
        integers.addAll(integers1);
        System.out.println(integers);

        //Пустой лист или нет
        boolean empty = integers.isEmpty();

        //Индекс элемента
        integers.indexOf(5);

        //Содержит ли все элементы из другого Листа
        boolean b = integers.containsAll(List.of(1, 5));

        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 4, 5));

    }
}
