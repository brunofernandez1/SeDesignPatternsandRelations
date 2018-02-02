package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 */
public class StateStart implements StateInterf {

    String stateName;

    public StateStart(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public void doStateAction(StateMachine machine) {
        System.out.println("did action in start state and changed state");
        machine.setState(this);

    }
    @Override
    public String toString(){
        return this.stateName;

    }
}
