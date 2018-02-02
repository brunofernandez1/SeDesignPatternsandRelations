package patterns.state;

/**
 * Created by Bruno on 02.02.2018.
 */
public class StateMachine {
    private StateInterf state;



    public String getState(){
        return this.state.toString();
    }

    public void setState(StateInterf state){
        this.state = state;
        System.out.println(state);
    }



}
