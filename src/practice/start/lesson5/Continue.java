package practice.start.lesson5;

public class Continue {
    public static void main(String[] args) {
        //Задание спортсмену. Бросает кости, если выпадает от 1 до 5 то он отжимается
        //А если 6 то отдыхает
        int[] results = {3, 5, 6, 2, 1};
        for (int result : results) {
            System.out.println(result);
            if (result == 6) {
                continue;
            }
            System.out.println("Спортсмен отжимается");
        }
    }
}
