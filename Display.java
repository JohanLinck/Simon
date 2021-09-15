import javax.swing.*;

public class Display {
 

  public static void main(String[] args) {
    JFrame frame = new JFrame();
   
    
    frame.setTitle("Simon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    new Simon(3,3, frame);
    frame.setVisible(true);

  }

}
