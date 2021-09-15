import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Tiles extends JFrame{

    JButton button;

    Tiles(String hex, ActionListener action) {

        button = new JButton();
        button.setBackground(Color.decode(hex));

        button.addActionListener(action);

        

    }






}