package Lab_5;

abstract public class Shape { // Абстрактный класс предоставляет базовый набор свойств и методов для других классов, но сам по себе не может быть инстанциирован.

    protected String color; // Защищенный модификатор означает, что эти переменные доступны в подклассах, но не напрямую извне.
    protected boolean filled; // заполненность

    abstract double getArea(); // прощадь

    abstract double getPerimeter(); // периметр

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}