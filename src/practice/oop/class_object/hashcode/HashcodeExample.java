package practice.oop.class_object.hashcode;

import practice.oop.class_object.equals.Child;

public class HashcodeExample {
    public static void main(String[] args) {
        Child child1 = new Child("Киров Сергей", 2019);
        Child child2 = new Child("Петров Иван", 2018);
        Child child3 = new Child("Меньшикова Анастасия", 2018);
        Child child4 = new Child("Иванов Валентин", 2019);

        Child[] group0 = {child3, child2};
        Child[] group1 = {child1, child4};
        Child[][] children = {group0, group1};

        Child childForFind = new Child("Киров Сергей", 2019);

        ChildrenGardenWithGroups childrenGardenWithGroups = new ChildrenGardenWithGroups(children);

        //Hashcode поиск (указываем где искать вот так -> [childForFind.hashCode()]
        boolean result = false;
        for (Child child : childrenGardenWithGroups.getChildren()[childForFind.hashCode()]) {
            if (child.equals(childForFind)) {
                result = true;
                break;
            }
        }
        System.out.println(result);


        //Equals поиск
        for (Child[] group : childrenGardenWithGroups.getChildren()) {
            for (Child child : group) {
                if (child.equals(childForFind)) {
                    break;
                }
            }

        }
    }
}
