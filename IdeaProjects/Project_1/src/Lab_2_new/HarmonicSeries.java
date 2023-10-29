package Lab_2_new;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n = 10; // Количество чисел в гармоническом ряду

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println("Член " + i + ": " + sum);
        }
    }
}
