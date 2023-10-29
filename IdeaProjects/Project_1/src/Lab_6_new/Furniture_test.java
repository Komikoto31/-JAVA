package Lab_6_new;

public class Furniture_test {
    public static void main(String[] args) {
        // Создаем объекты разных видов мебели
        Furniture chair = new Chair("Стул из дерева", 50.0);
        Furniture table = new Table("Обеденный стол", 150.0);

        // Создаем массив мебели для магазина
        Furniture[] inventory = { chair, table };

        // Создаем магазин мебели
        FurnitureShop shop = new FurnitureShop(inventory);

        // Отображаем инвентарь магазина
        shop.displayInventory();
    }
}
