package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 */
public class StateTester {

    public static void main(String[] args) {
        StateMachine machine = new StateMachine();
        StateStart start = new StateStart("startstate");
        StateStop stop = new StateStop("stopstate");

        start.doStateAction(machine);
        machine.getState();

        stop.doStateAction(machine);
        machine.getState();
    }
}
