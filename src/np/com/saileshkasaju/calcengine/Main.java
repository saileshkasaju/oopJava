package np.com.saileshkasaju.calcengine;

import np.com.saileshkasaju.calcengine.command.*;

public class Main {
  
  public static void main(String[] args) {
    int x = 2, y = 4;
    MathCommand cmd = new PowerCommand();
    System.out.println(cmd.execute(x, y));
  }
}
