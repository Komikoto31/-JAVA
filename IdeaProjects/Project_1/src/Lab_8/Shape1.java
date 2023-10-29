package Lab_8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Абстрактный класс для фигур
abstract class Shape1 {
    protected Color color;
    protected int x, y;

    public Shape1(int x, int y) {
        this.x = x;
        this.y = y;
        Random random = new Random();
        // Генерация случайного цвета
        this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    // Абстрактный метод для отрисовки фигуры
    abstract void draw(Graphics g);
}
