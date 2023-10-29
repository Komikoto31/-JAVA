package Lab_13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {
        String fileName = "D:\\output.txt"; // Имя файла, который вы хотите прочитать

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Содержимое файла " + fileName + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Выводим каждую строку файла на экран
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}



