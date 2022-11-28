package SRC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.Point;
import javax.swing.*;

public class Gui {
    private static JFrame lastFrame = null;

    public Gui() {
        SwingUtilities.invokeLater(this::showFrame);
    }

    private void showFrame() {
        int i,j;
        JFrame frame = new JFrame("Mastermind ");
        JTextField textField = new JTextField();

        
        for (i = 0; i<5; i++){
            for (j = 0; j<2; j++){
                JButton button = new JButton("Red");
                button.setBounds(20+(i*100), 20+(j*60), 95, 30);
                frame.add(button);
            }
        }

        textField.setBounds(50,200,450,100);
        textField.setText("Eingabe");
        frame.add(textField);

        // textField.setBounds(50,350,450,100);
        // textField.setText("Ausgabe");
        // frame.add(textField);

        frame.add(new JLabel("Mastermind"));
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);



        

        frame.pack();
        if (lastFrame == null) {
            frame.setLocationByPlatform(true);
        } else {
            Point p = lastFrame.getLocation();
            p.translate(100, 100);
            frame.setLocation(p);
        }
        lastFrame = frame;

        frame.setSize(600,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
