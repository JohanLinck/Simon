import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simon implements ActionListener  {

    int gridx, gridy;
    JFrame frame;

    Tiles[] tiles;

    public Simon(int gridX, int gridY, JFrame frame){

        this.gridx = gridX;
        this.gridy = gridY;
        this.frame = frame;

        this.tiles = new Tiles[gridY * gridX];


    }

    public void actionPerformed(ActionEvent e) {

    }

    
}