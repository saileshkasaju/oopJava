package np.com.saileshkasaju.calcengine.command;

/**
 * Created by Edge on 1/9/2017.
 */
public class MathCommandFactory {
  public MathCommand get(int ch) {
    if (ch == 1) {
      return new AddCommand();
    } else if (ch == 2) {
      return new SubCommand();
    } else if (ch == 3) {
      return new DivCommand();
    } else if (ch == 4) {
      return new MulCommand();
    } else if (ch == 5) {
      return new PowerCommand();
    } else return null;
  }
}
