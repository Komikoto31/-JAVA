package Lab_2;
import java.util.Arrays;
import java.util.Random;

public class RandomArraySort {
    public static void main(String[] args) {
        // Создаем генератор случайных чисел
        Random random = new Random();

        // Задаем размер массива
        int size = 10;

        // Создаем массив целых чисел
        int[] array = new int[size];

        // Заполняем массив случайными числами
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100); // Генерируем случайные числа от 0 до 99
        }

        // Выводим исходный массив на экран
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Сортируем массив
        Arrays.sort(array);

        // Выводим отсортированный массив на экран
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}

