import javax.swing.*;

public class Display {
  static boolean start = true;
  static Simon simon;
  

  public static void main(String[] args) {
    
    
    simon = new Simon(3,3);
    

    Start();
    
  }

  public static void Start() {

    
    while (start) {

      start = simon.GetReihenfolge();


    }

    System.exit(0);




  }




}
