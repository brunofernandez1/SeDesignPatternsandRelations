package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 */
public class StateTester {

    public static void main(String[] args) {
        //Create state machine
        StateMachine machine = new StateMachine();
        StateMachine machine2 = new StateMachine();
        StateMachine machine3 = new StateMachine();
        StateMachine machine4 = new StateMachine();

        //create states. can be used for all statemachines
        StateStart start = new StateStart("startstate");
        StateStop stop = new StateStop("stopstate");

        //do the action in the state for the machine and change state
        start.doStateAction(machine);
        machine.getState();

        //do the action in the state for the machine and change state
        stop.doStateAction(machine);
        machine.getState();
    }
}
