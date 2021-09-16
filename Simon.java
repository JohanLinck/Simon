import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.util.Random;

public class Simon extends JFrame implements ActionListener  {

    int gridx, gridy;
    JFrame frame;

    Tiles[] tiles;
    List<Tiles> liste = new List<Tiles>();

    public boolean reihenfolge = true; 

    public Simon(int gridX, int gridY, JFrame frame){

        System.out.println("Generated");
        this.gridx = gridX;
        this.gridy = gridY;
        this.frame = frame;
        frame.setLayout(new GridLayout(gridx,gridy,0,0));
        this.tiles = new Tiles[gridY * gridX];
        GenerateTiles();
        
        ListeAddTile();
        


    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().getClass() == new JButton().getClass()) {

            if (liste.GetCurrent() == null) 
            {ListeAddTile(); liste.ToHead(); }
            
            if(e.getSource() == liste.GetCurrent().getContent().GetButton()) {
                    
                    if (liste.GetCurrent().GetNextNode() == null) {

                        ListeAddTile(); liste.ToHead(); 

                    } else {liste.Next();}
                
                    
               } else {

                System.out.println("falsch");
                liste.ToHead();

            }   
            
            

        }

        
        


    }


    public void ListeAddTile() {

       



        Random random = new Random();
        int r = random.nextInt(tiles.length);
        System.out.println(tiles[r].number);
        tiles[r].Leuchte();
        liste.AddNode(tiles[r]);



        Glow();




        liste.ToHead();





    }


    public void Glow() {

        liste.ToHead();

        if (liste.GetHead() == liste.GetTail()) {liste.GetHead().getContent().Leuchte();}

        while (liste.GetCurrent().GetNextNode() != null) {

            liste.GetCurrent().getContent().Leuchte();
            liste.Next();

        }


    }





    public void GenerateTiles() {

        for (int i = 0; i < (gridy * gridx); i++ ) {

            tiles[i] = new Tiles(RandomColor() , this, i);
            frame.add(tiles[i].GetButton());
        }

        liste.ToHead();
    }

    public String RandomColor() {

         
        // create random object - reuse this as often as possible
        Random random = new Random();

         
        // create a big random number - maximum is ffffff (hex) = 16777215 (dez)
        int nextInt = random.nextInt(0xffffff + 1);
 
        // format it as hexadecimal string (with hashtag and leading zeros)
        String colorCode = String.format("#%06x", nextInt);
 
        return colorCode;
    }

    public boolean GetReihenfolge() {

        return reihenfolge;

    }

}