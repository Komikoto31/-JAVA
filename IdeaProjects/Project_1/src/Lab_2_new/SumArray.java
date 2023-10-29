package Lab_2_new;
public class SumArray {
    public static void main(String[] args) {
        // Создаем массив чисел
        int[] numbers = {1, 2, 3, 4, 5};

        // Сумма с использованием цикла for
        int sumFor = 0;
        // Инициализируем счетчик i и выполняем цикл от 0 до длины массива
        for (int i = 0; i < numbers.length; i++) {
            // Добавляем текущий элемент массива к сумме
            sumFor += numbers[i];
        }
        // Выводим сумму на экран
        System.out.println("Сумма с использованием цикла for: " + sumFor);

        // Сумма с использованием цикла while
        int sumWhile = 0;
        // Инициализируем счетчик j и выполняем цикл, пока j меньше длины массива
        int j = 0;
        while (j < numbers.length) {
            // Добавляем текущий элемент массива к сумме
            sumWhile += numbers[j];
            // Увеличиваем счетчик j
            j++;
        }
        // Выводим сумму на экран
        System.out.println("Сумма с использованием цикла while: " + sumWhile);

        // Сумма с использованием цикла do-while
        int sumDoWhile = 0;
        // Инициализируем счетчик k и выполняем цикл, хотя бы один раз
        int k = 0;
        do {
            // Добавляем текущий элемент массива к сумме
            sumDoWhile += numbers[k];
            // Увеличиваем счетчик k
            k++;
        } while (k < numbers.length); // Проверяем условие
        // Выводим сумму на экран
        System.out.println("Сумма с использованием цикла do-while: " + sumDoWhile);
    }
}

