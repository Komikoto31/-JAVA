package Lab_10_new;

public class Test_14 {
    public static void main(String[] args) {
        int n = 12345;
        printDigits(n);
    }

    // Рекурсивная функция для вывода цифр числа
    public static void printDigits(int n) {
        if (n < 10) {
            // Если число меньше 10, это последняя цифра
            System.out.println(n);
        } else {
            // Рекурсивно выводим все цифры кроме последней
            printDigits(n / 10);
            // Выводим последнюю цифру
            System.out.println(n % 10);
        }
    }
}
