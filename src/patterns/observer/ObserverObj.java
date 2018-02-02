package patterns.observer;

public class ObserverObj extends Observer {

    public ObservableObj observableObj;

    public ObserverObj(ObservableObj observableObj){
        this.observableObj = observableObj;
        this.observableObj.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + ( observableObj.getState() ) );
    }

}
