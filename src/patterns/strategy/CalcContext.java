package patterns.strategy;

/**
 * Created by Bruno on 02.02.2018.
 * this is the calculator context that accepts the stragies as parameter
 */
public class CalcContext {
    private StrategyIface strategy;

    public void setStrategy(StrategyIface strategy){
        this.strategy = strategy;
    }

    public void calculate(int first, int second){
        this.strategy.calcNumbers(first, second);
    }
}
