package start.lesson6;

public class StringPractice {
    public static void main(String[] args) {
        //Выбрать текст начиная c 11 символа до конца строки, перевести в нижний регистр,
        //разбить строку на массив по пробелу. Вывести на экран каждое слово из массива и длину строки этого слова
        String text = "my name is Giovanni Giorgio";

        //Моё кривое решение
//        String[] text2 = text.substring(11).toLowerCase().split(" ");
//
//        int length0 = text2[0].length();
//        int length1 = text2[1].length();
//
//        System.out.println(Arrays.toString(new String[]{text2[0]}) + length0);
//        System.out.println(Arrays.toString(new String[]{text2[1]}) + length1);

        //Решение
        String[] array = text.substring(11).toLowerCase().split(" ");
        for (String word : array) {
            System.out.println(word);
            System.out.println(word.length());
        }
    }
}
