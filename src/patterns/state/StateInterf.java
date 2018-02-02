package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 */
public interface StateInterf {

    public abstract void doStateAction(StateMachine machine);
    public abstract String toString();
}
