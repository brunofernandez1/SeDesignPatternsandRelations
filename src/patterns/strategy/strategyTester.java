package patterns.strategy;

/**
 * Created by Bruno on 02.02.2018.
 * strategy tester
 */
public class strategyTester {

    public static void main(String[] args) {
        CalcContext mycalc = new CalcContext();
        StrategyPlus plus = new StrategyPlus();
        StrategyMinus minus = new StrategyMinus();

        //set once a plus strategy and calculate
        mycalc.setStrategy(plus);
        mycalc.calculate(2, 2);

        //set once a minus strategy and calculate
        mycalc.setStrategy(minus);
        mycalc.calculate(2, 1);
    }
}
