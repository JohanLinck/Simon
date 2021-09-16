import javax.swing.*;

public class Display {
  static boolean start = true;
  static Simon simon;
  static JFrame frame;

  public static void main(String[] args) {
    
    frame = new JFrame();
   
    
    frame.setTitle("Simon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    simon = new Simon(3,3, frame);
    frame.setVisible(true);

    Start();
    
  }

  public static void Start() {

    
    while (start) {

      start = simon.GetReihenfolge();


    }

    System.exit(0);




  }




}
