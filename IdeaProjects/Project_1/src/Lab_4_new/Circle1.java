package Lab_4_new;
public class Circle1 {
    private double radius; // Радиус окружности

    // Конструктор для создания окружности с заданным радиусом
    public Circle1(double radius) {
        setRadius(radius);
    }

    // Метод для установки радиуса окружности
    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    // Метод для получения радиуса окружности
    public double getRadius() {
        return radius;
    }

    // Метод для вычисления площади окружности
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Метод для вычисления длины окружности
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}