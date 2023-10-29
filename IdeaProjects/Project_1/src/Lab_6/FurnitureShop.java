package Lab_6;

class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(Furniture[] inventory) {
        this.inventory = inventory;
    }

    // Метод для отображения всего инвентаря магазина
    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture item : inventory) {
            System.out.println("Тип: " + item.getType());
            item.displayInfo();
            System.out.println();
        }
    }
}
