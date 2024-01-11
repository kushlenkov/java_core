package lecture.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readers {
    public static void main(String[] args) throws IOException {
        //Чтение
        String filename = "E:\\ycheba\\java_repos\\java_core\\test.txt";

        FileReader fileReader = new FileReader(filename);
        String result = "";
        while (fileReader.ready()) {
            int read = fileReader.read();
            result += (char) read;
        }
        System.out.println(result);
        fileReader.close();
        System.out.println("_____________________");

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String resultBuffered = "";
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            resultBuffered += line + '\n';
        }
        System.out.println(resultBuffered);
        bufferedReader.close();
    }
}
