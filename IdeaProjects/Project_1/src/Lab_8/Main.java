package Lab_8;

import javax.swing.*;

// Главный класс приложения
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);

        frame.setVisible(true);
    }
}