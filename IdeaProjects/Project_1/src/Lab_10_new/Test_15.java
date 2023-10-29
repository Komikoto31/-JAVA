package Lab_10_new;

public class Test_15 {
    public static void main(String[] args) {
        int n = 12345;
        printDigitsReverse(n);
    }

    // Рекурсивная функция для вывода цифр числа в обратном порядке
    public static void printDigitsReverse(int n) {
        if (n < 10) {
            // Если число меньше 10, это последняя цифра
            System.out.println(n);
        } else {
            // Выводим последнюю цифру
            System.out.println(n % 10);
            // Рекурсивно выводим все цифры, кроме последней
            printDigitsReverse(n / 10);
        }
    }
}
