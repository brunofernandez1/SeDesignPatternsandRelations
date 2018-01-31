package patterns.singleton;

/**
 * Created by Bruno on 31.01.2018.
 */
public class SingletonTester {

    public static void main(String[] args) {
        //sout should say that there is it has created a new instance
        MySingleton.getInstance();

        //sout should return the existing instance
        MySingleton.getInstance();
    }
}
