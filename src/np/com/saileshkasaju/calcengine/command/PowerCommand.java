package np.com.saileshkasaju.calcengine.command;

/**
 * Created by Edge on 1/9/2017.
 */
public class PowerCommand extends MathCommand {
  @Override
  public double execute(double x, double y) {
    double total = 1;
    for (int i = 0 ; i < y; i ++)
      total *= x;
    return total;
  }
}
