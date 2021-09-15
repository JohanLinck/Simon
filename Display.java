import javax.swing.*;

public class Display {

  Simon simon = new Simon();

  public static void main(String[] args) {

    JFrame frame = new JFrame();
    frame.setTitle("Simon");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);

    frame.setVisible(true);

  }

}
