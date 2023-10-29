package Lab_6;

abstract class Furniture {
    private String name;
    private double price;

    // Конструктор
    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для отображения информации о мебели
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Цена: $" + price);
    }

    // Абстрактный метод для определения типа мебели
    public abstract String getType();
}
