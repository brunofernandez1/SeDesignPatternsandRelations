package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 * one state that inherits from state interface
 */
public class StateStop implements StateInterf {

    String stateName;

    public StateStop(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public void doStateAction(StateMachine machine) {
        System.out.println("did action in stop state and changed state");
        machine.setState(this);


    }

    @Override
    public String toString() {
        return this.stateName;
    }
}
