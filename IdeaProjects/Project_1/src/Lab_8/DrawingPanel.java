package Lab_8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// Класс, представляющий окно
class DrawingPanel extends JPanel {
    private Shape1[] shapes;

    public DrawingPanel() {
        shapes = new Shape1[20];
        Random random = new Random();

        // Генерация 20 случайных фигур
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(400); // случайная позиция по X
            int y = random.nextInt(400); // случайная позиция по Y
            int width = random.nextInt(50) + 20; // случайная ширина от 20 до 70
            int height = random.nextInt(50) + 20; // случайная высота от 20 до 70
            int radius = random.nextInt(30) + 20; // случайный радиус от 20 до 50

            if (i % 2 == 0) {
                shapes[i] = new Circle1(x, y, radius);
            } else {
                shapes[i] = new Rectangle(x, y, width, height);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Отрисовка всех фигур
        for (Shape1 shape : shapes) {
            shape.draw(g);
        }
    }
}

