package patterns.singleton;

/**
 * Created by Bruno on 31.01.2018.
 * singleton pattern can for example be used for database connections
 *
 */
public class MySingleton {


    private static MySingleton instance = null;

    //make singleton protected so you can only start an instance from the getInstance method
    protected MySingleton(){};

    public static MySingleton getInstance(){
        //create only an instance if there is none
        if (instance == null){
            //overwrite instance with a new instance
            instance = new MySingleton();
            System.out.println("Singleton instance created");
            return instance;
        }
        else {
            //when there is already an instance, you just return the existing one
            System.out.println("there is already an instance. Here it is");
            return instance;
        }
    }

}
