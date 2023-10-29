package Lab_8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AnimationExample {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;

    private int currentFrame = 0;
    private ImageIcon[] frames;

    public AnimationExample() {
        // Загружаем кадры анимации
        frames = new ImageIcon[3]; // Предполагаем, что у вас три кадра
        for (int i = 0; i < 3; i++) {
            frames[i] = new ImageIcon("D:\\frame" + i + ".png"); // Укажите путь к вашим кадрам
        }

        // Создаем окно
        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Панель для отображения анимации
        JPanel animationPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                frames[currentFrame].paintIcon(this, g, 0, 0);
            }
        };

        frame.add(animationPanel);
        frame.setVisible(true);

        // Создаем таймер для обновления кадров
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationPanel.repaint(); // Перерисовываем панель с новым кадром
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnimationExample();
            }
        });
    }
}
