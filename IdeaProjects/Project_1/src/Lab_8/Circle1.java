package Lab_8;

import java.awt.*;

// Класс для круга
class Circle1 extends Shape1 {
    private int radius;

    public Circle1(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, radius * 2, radius * 2);
    }
}