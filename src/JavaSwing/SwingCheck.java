package JavaSwing;

import javax.swing.*;

public class SwingCheck {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Swing Check");
        jFrame.setSize(300,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("Swing is Available",SwingConstants.CENTER);
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }
}
