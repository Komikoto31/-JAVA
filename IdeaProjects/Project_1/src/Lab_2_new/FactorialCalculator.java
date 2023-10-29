package Lab_2_new;

public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5; // вычислить факториал
        long factorial = calculateFactorial(number); // Вызываем метод для вычисления факториала
        System.out.println("Факториал числа " + number + " равен " + factorial); // Выводим результат
    }

    // Метод для вычисления факториала
    public static long calculateFactorial(int n) {
        if (n < 0) { // Проверка на отрицательное число
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел."); // создание исключения
        }

        long result = 1; // Начальное значение результата

        for (int i = 1; i <= n; i++) { // Цикл для умножения чисел от 1 до n
            result *= i; // Умножаем текущее число на результат
        }

        return result; // Возвращаем факториал
    }
}
