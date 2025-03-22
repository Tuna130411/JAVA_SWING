package day17;

import javax.swing.*;
import java.awt.*;

public class JButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel 예제");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton button = new JButton("클릭해주세요!");
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
