package Lab_4;
public class TestCircle1 {
    public static void main(String[] args) {
        // Создаем объект окружности с радиусом 5
        Circle1 circle = new Circle1(5);

        // Выводим информацию об окружности
        System.out.println("Радиус окружности: " + circle.getRadius());
        System.out.println("Площадь окружности: " + circle.calculateArea());
        System.out.println("Длина окружности: " + circle.calculateCircumference());
    }
}
