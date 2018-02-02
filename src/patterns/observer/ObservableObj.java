package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableObj {
    private List<patterns.observer.Observer> observers = new ArrayList<patterns.observer.Observer>();
    private int state;

    public ObservableObj(){

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(patterns.observer.Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (patterns.observer.Observer observer : observers) {
            observer.update();
        }
    }
}
