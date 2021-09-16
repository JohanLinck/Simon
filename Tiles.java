import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.BorderFactory;

public class Tiles extends JFrame {

    JButton button;
    String hex;
    int number;
    Tiles(String hex, ActionListener action, int n) {

        this.hex = hex;
        this.number = n;
        button = new JButton(""+n);
        button.setBackground(Color.decode(hex));
        button.setBorder(BorderFactory.createLineBorder(Color.decode(hex)));
        

        button.addActionListener(action);

        

    }


    public void Leuchte() {

        button.setBackground(invert(Color.decode(hex)));

       

        button.setBackground(Color.decode(hex));

    }

    
    
    
    
    public JButton GetButton() {
        return button;
    }






    public static Color invert(Color c) {

        
        int r = 255 - c.getRed();
        int g = 255 - c.getGreen();
        int b = 255 - c.getBlue();

      
        return new Color(r, g, b, 100);
        
    }

}