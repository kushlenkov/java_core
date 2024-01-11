package lecture.lesson9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PracticeEx2 {
    public static void main(String[] args) throws IOException {
        //Дан файл со следующим содержанием:
        //price;carModel;mileage
        //10_000;bmw;20_000

        String carFileName = "E:\\ycheba\\java_repos\\java_core\\cars.csv";
        int countAllLines = countLines(carFileName);

        Car[] cars = new Car[countAllLines];
        readCarsToArray(carFileName, cars);
        System.out.println(Arrays.toString(cars));
    }

    public static void readCarsToArray(String filename, Car[] cars) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            int countLines = 0;
            while (reader.ready()) {
                String line = reader.readLine();
                if (countLines == 0) {
                    countLines++;
                    continue;
                }
                String[] fields = line.split(";");
                //10_000;bmw;20_000
                double price = Double.parseDouble(fields[0]);
                String model = fields[1];
                double mileage = Double.parseDouble(fields[2]);
                Car car = new Car(price, model, mileage);
                cars[countLines-1] = car;
                countLines++;
            }
        }
    }

    public static int countLines (String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int countLines = 0;
            while (reader.ready()) {
                reader.readLine();
                countLines++;
            }
            return countLines - 1;
        }
    }
}
