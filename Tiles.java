import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.BorderFactory;


public class Tiles extends JFrame{

    JButton button;

    Tiles(String hex, ActionListener action) {

        button = new JButton();
        button.setBackground(Color.decode(hex));
        button.setBorder(BorderFactory.createLineBorder(Color.decode(hex)));
        

        button.addActionListener(action);

        

    }


    public void Leuchte() {


    }

    public JButton GetButton() {
        return button;
    }




}