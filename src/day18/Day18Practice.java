package day18;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Day18Practice {
    public static void main(String[] args) {
        JFrame frame = new JFrame("실습 문제");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("버튼을 눌러보세요");
        JButton button = new JButton("클릭하세요");


        button.addActionListener(new ActionListener() {
            int count = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                count += 1;
                label.setText("" + count);
            }
        });

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
