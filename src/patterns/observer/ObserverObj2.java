package patterns.observer;

public class ObserverObj2 extends Observer{
    private ObservableObj observableObj;

    public ObserverObj2(ObservableObj observableObj){
        this.observableObj = observableObj;
        this.observableObj.attach(this);
    }


    @Override
    public void update() {
        System.out.println( "Binary String: " + ( observableObj.getState() ) );
    }
}
