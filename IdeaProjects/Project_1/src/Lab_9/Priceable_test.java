package Lab_9;

public class Priceable_test {
    public static void main(String[] args) {
        // Создаем объекты разных классов
        Priceable laptop = new Product("Ноутбук", 1000.0);
        Priceable consulting = new Service("Консультация", 50.0);

        // Выводим цены объектов
        System.out.println("Цена ноутбука: $" + laptop.getPrice());
        System.out.println("Часовая ставка за консультацию: $" + consulting.getPrice());
    }
}
