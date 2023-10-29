package Lab_13;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст для записи в файл: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("D:\\output.txt")) {
            writer.write(input); // Записываем введенный текст в файл
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}
