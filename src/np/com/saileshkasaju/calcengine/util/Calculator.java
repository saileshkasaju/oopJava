package np.com.saileshkasaju.calcengine.util;

/**
 * Created by Edge on 1/9/2017.
 */
public class Calculator {
  
  private int add(int x, int y) {
    return (x+y);
  }
  private int subtract(int x, int y) {
    return (x-y);
  }
  private int multiply (int x, int y) {
    return (x*y);
  }
  private int divide (int x, int y) {
    return (x/y);
  }
  private double power(int x, int y) {
    double total = 1;
    for (int i = 0 ; i < y; i ++)
      total *= x;
    return total;
  }
  public void calculate(int x, int y, char opCodes) {
    if (opCodes == 'a')
      System.out.println(add(x, y));
    else if (opCodes == 's')
      System.out.println(subtract(x, y));
    else if (opCodes == 'd') {
      System.out.println(divide(x, y));
    } else if (opCodes == 'm') {
      System.out.println(multiply(x, y));
    } else if (opCodes == 'p') {
      System.out.println(power(x, y));
    } else {
      System.out.println("Invalid Op Code");
    }
  }
}
