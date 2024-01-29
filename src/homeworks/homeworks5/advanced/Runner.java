package homeworks.homeworks5.advanced;

import homeworks.homeworks5.base.FinancialRecord;

import java.io.*;
import java.util.Random;

public class Runner {
    private static final String DELIMITER = ";";
    private static final String header = String.format("Доход%sРасход\n", DELIMITER);

    public static void main(String[] args) {
        task();
    }

    public static void task() {

        // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать 10 отчетов (объектов класса FinancialRecord),
        // с разными доходами и расходами (Смотри класс new Random(1).nextInt(10000) )
        // 4. Записать в файл "report_2.txt" все данные из отчетов.
        // 5. Прочитать файл report_2.txt, просуммировать все доходы и вывести на экран,
        // то же самое с расходами
        // Ожидаемый результат: общие доходы - (какое то число), общие расходы - (какое то число)

        String reportFilename = "E:\\ycheba\\java_repos\\java_core\\src\\homeworks\\homeworks5\\advanced\\report.txt";
        FinancialRecord[] records = generateFinancialRecords();
        writeFinancialRecordsToFile(records, reportFilename);
        FinancialRecord[] recordsFromFile = readFinancialRecordsFromFile(reportFilename, true);

        int totalIncome = 0;
        int totalOutcome = 0;

        for (FinancialRecord record : recordsFromFile) {
            totalIncome += record.getIncomes();
            totalOutcome += record.getOutcomes();
        }
        System.out.printf("Общие доходы - %s, общие расходы - %s", totalIncome, totalOutcome);

    }

    //Генератор отчетов
    public static FinancialRecord[] generateFinancialRecords() {
        Random random = new Random(1);
        FinancialRecord[] records = new FinancialRecord[10];
        for (int i = 0; i < 10; i++) {
            records[i] = new FinancialRecord(random.nextInt(10_000), random.nextInt(10_000));
        }
        return records;
    }

    //Запись отчетов в файл
    public static void writeFinancialRecordsToFile(FinancialRecord[] records, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(header);
            for (FinancialRecord record : records) {
                String resultToWrite = String.format("%s%s%s\n", record.getIncomes(), DELIMITER, record.getOutcomes());
                fileWriter.write(resultToWrite);
            }

        } catch (IOException e) {
            System.out.println("Что-то пошло не так при записи в файл");
            System.out.println(e.getMessage());
        }
    }

    //Чтение из файла
    public static FinancialRecord[] readFinancialRecordsFromFile(String filename, boolean skipFirstRow) {
        int rowsInFile = countRowsInFile(filename, skipFirstRow);
        FinancialRecord[] records = new FinancialRecord[rowsInFile];
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            while (bufferedReader.ready()) {
                if (skipFirstRow) {
                    bufferedReader.readLine();
                    skipFirstRow = false;
                    continue;
                }
                String[] fields = bufferedReader.readLine().split(DELIMITER);
                if (fields.length == 1) {
                    continue;
                }
                int income = Integer.parseInt(fields[0]);
                int outcome = Integer.parseInt(fields[1]);
                FinancialRecord financialRecord = new FinancialRecord(income, outcome);
                records[count] = financialRecord;
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return records;
    }

    //Считаем строки в файле
    private static int countRowsInFile(String filename, boolean skipFirstRow) {
        int count = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            while (bufferedReader.ready()) {
                if (skipFirstRow) {
                    bufferedReader.readLine();
                    skipFirstRow = false;
                    continue;
                }
                String line = bufferedReader.readLine();
                if (line.isEmpty()) {
                    continue;
                }
                count++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException (e);
        }
        return count;
    }

}
