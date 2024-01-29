package homeworks.homeworks5.base;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        //Базовая
        //Задача №1
        //Необходимо:
        // 1. Создать файл "my_first_file.txt". На первой строке написать: "Моя бабушка",
        // на второй: "читает газету жизнь"
        // 2. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        String fileName = "E:\\ycheba\\java_repos\\java_core\\src\\homeworks\\homeworks5\\base\\my_first_file.txt";
        String one = "Моя бабушка\n" +
                "читает газету жизнь";

        try (FileWriter fileWriterOne = new FileWriter(fileName)) {
            fileWriterOne.write(one);
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String readResult = "";
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            readResult += line + ' ';
        }
        System.out.println(readResult);
        bufferedReader.close();

        //Задача №2
        //Необходимо:
        // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework5, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300

        FinancialRecord financialRecord = new FinancialRecord(500, 300);

        String fileNameTwo = "E:\\ycheba\\java_repos\\java_core\\src\\homeworks\\homeworks5\\base\\report.txt";
        String writeReport = "доходы = " + financialRecord.getIncomes() + ", расходы = " + financialRecord.getOutcomes();

        try (FileWriter fileWriterOne = new FileWriter(fileNameTwo)) {
            fileWriterOne.write(writeReport);
        }

    }
}
