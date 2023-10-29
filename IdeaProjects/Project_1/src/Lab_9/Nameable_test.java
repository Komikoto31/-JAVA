package Lab_9;

public class Nameable_test {
    public static void main(String[] args) {
        // Создаем объекты разных классов
        Nameable earth = new Planet("Земля");
        Nameable toyota = new Car("Toyota");

        // Выводим имена объектов
        System.out.println("Имя планеты: " + earth.getName());
        System.out.println("Имя машины: " + toyota.getName());
    }
}
