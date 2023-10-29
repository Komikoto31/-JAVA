package Lab_2;

public class CommandLineArguments {
    public static void main(String[] args) {
        // Перебираем аргументы командной строки в цикле for
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + args[i]);
        }
    }
}
