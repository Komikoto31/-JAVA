package Lab_6_new;
public class Main {
    public static void main(String[] args) {
        // Создаем объекты тарелки и чашки
        Dish plate = new Plate("керамика", 500, false);
        Dish cup = new Cup("стекло", 250, true);

        // Выводим информацию о посуде
        plate.displayInfo();
        cup.displayInfo();
    }
}
