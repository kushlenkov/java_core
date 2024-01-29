package practice.input_output;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = FileInputExample.class.getClassLoader().getResourceAsStream("article.txt");

//        FileReader fileReader = new FileReader("путь до файла (прописываем абсолютный путь)", StandardCharsets.UTF_8);
//        StringBuilder stringBuilder = new StringBuilder();
//        while (fileReader.ready()) {
//            stringBuilder.append((char) fileReader.read());
//        }
//        System.out.println(stringBuilder);
//        fileReader.close();

        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (count == lineNeeded) {
                System.out.println(nextLine);
            }
            count++;
        }
        scanner.close();
        inputStream.close();
    }
}
