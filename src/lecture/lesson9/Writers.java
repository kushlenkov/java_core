package lecture.lesson9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writers {
    public static void main(String[] args) throws IOException {
        String fileToWrite = "E:\\ycheba\\java_repos\\java_core\\test2.txt";
        //Запись
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileToWrite))) {
            fileWriter.write("Я стал программистом!");
        }

        FileWriter fileWriter2 = new FileWriter(fileToWrite, true);
        fileWriter2.write("И устроился на работу!");
        fileWriter2.close();

    }
}
