package Lab_4;

import Lab_4.FootballFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FootballFrame footballFrame = new FootballFrame("Score Table");
        footballFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        footballFrame.pack();
        footballFrame.setSize(900, 600);
        footballFrame.setVisible(true);
    }
}