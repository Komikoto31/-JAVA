package Lab_6;
abstract class Dish {
    private String material;
    private int capacity;

    // Конструктор
    public Dish(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
    }

    // Абстрактный метод для вывода информации о посуде
    public abstract void displayInfo();

    // Геттеры и сеттеры
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
