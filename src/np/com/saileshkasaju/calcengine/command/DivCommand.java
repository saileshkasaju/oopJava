package np.com.saileshkasaju.calcengine.command;

/**
 * Created by Edge on 1/9/2017.
 */
public class DivCommand extends MathCommand {
  @Override
  public double execute(double x, double y) {
    return x / y;
  }
}
