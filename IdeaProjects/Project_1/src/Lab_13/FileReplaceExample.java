package Lab_13;
import java.io.*;

public class FileReplaceExample {
    public static void main(String[] args) {
        String fileName = "D:\\output.txt"; // Имя файла, который вы хотите изменить

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            // Считываем старое содержимое файла
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            // Запрашиваем новую информацию с клавиатуры
            System.out.print("Введите новую информацию: ");
            String newContent = new BufferedReader(new InputStreamReader(System.in)).readLine();

            // Заменяем старое содержимое новым
            content.setLength(0); // Очищаем StringBuilder
            content.append(newContent);

            // Записываем новое содержимое в файл
            writer.write(content.toString());
            System.out.println("Информация успешно заменена в файле.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}