package patterns.strategy;

/**
 * Created by Bruno on 02.02.2018.
 * this is the minus strategy that inherits from the strategy interface
 */
public class StrategyMinus implements StrategyIface {
    @Override
    public void calcNumbers(int first, int second) {
        System.out.println(first-second);
    }
}
