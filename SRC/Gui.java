package SRC;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Color;
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
        
        for (i = 0; i<5; i++){
            for (j = 0; j<2; j++){
                JButton button = new JButton("Red");
                button.setBounds(20+(i*100), 20+(j*60), 95, 45);
                
                switch (i+(j*5)) {
                    case 1:
                        button.setBackground(Color.RED);
                        break;
                    case 2:
                        button.setBackground(Color.BLUE);
                        break;
                    case 3:
                        button.setBackground(Color.CYAN);
                        break;
                    case 4:
                        button.setBackground(Color.GRAY);
                        break;
                    case 5:
                        button.setBackground(Color.GREEN);
                        break;
                    case 6:
                        button.setBackground(Color.MAGENTA);
                        break;
                    case 7:
                        button.setBackground(Color.ORANGE);
                        break;
                    case 8:
                        button.setBackground(Color.YELLOW);
                        break;
                    case 9:
                        button.setBackground(Color.WHITE);
                        break;
                    case 0:
                        button.setBackground(Color.LIGHT_GRAY);
                        break;
                }
                frame.add(button);
            }
        }

        JButton button = new JButton("kugel");
        button.setBounds(20+(300), 20, 95, 45);
        frame.add(button);

        JTextField textFieldEingabe = new JTextField();
        textFieldEingabe.setBounds(50,150,450,100);
        textFieldEingabe.setText("Eingabe");
        frame.add(textFieldEingabe);

        JTextField textFieldAugabe = new JTextField();
        textFieldAugabe.setBounds(50,300,450,100);
        textFieldAugabe.setText("Ausgabe");
        frame.add(textFieldAugabe);

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

        frame.setSize(550,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
