package Lab_6_new;

public class Dog_test {
    public static void main(String[] args) {
        // Создаем объекты разных пород собак
        Dog labrador = new LabradorRetriever("Барон", 3);
        Dog dalmatian = new Dalmatian("Шерлок", 2);

        // Издаем звуки (лаем) для каждой собаки
        labrador.bark();
        dalmatian.bark();
    }
}
