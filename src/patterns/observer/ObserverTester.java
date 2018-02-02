package patterns.observer;

public class ObserverTester {

    public static void main(String[] args) {
        ObservableObj observableObj = new ObservableObj();
        ObserverObj observerObj = new ObserverObj(observableObj);
        ObserverObj observerObj2 = new ObserverObj(observableObj);

        //observableObj.attach(observerObj);

        observableObj.setState(10);

        //observableObj.notifyAllObservers();

    }
}
