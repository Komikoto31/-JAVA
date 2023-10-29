package Lab_13;
import java.io.*;

public class FileAppendExample {
    public static void main(String[] args) {
        String fileName = "D:\\output.txt"; // Имя файла, в который вы хотите добавить текст

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            // Запрашиваем текст для добавления из клавиатуры
            System.out.print("Введите текст для добавления в файл: ");
            String newText = new BufferedReader(new InputStreamReader(System.in)).readLine();

            // Добавляем текст в файл
            writer.write(newText);
            writer.newLine(); // Добавляем новую строку для разделения текста

            System.out.println("Текст успешно добавлен в файл.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}
