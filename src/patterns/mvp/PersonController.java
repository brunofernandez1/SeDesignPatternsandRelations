package patterns.mvp;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Bruno on 01.02.2018.
 */
public class PersonController implements Observer {
    PersonModel model;
    PersonView view;

    public PersonController(PersonModel model, PersonView view){
        this.model = model;
        this.view = view;
    }

    public String getPersonName(){
        return model.getName();
    }

    public int getPersonAge(){
        return model.getAge();
    }

    public void setPersonName(String name){
        model.setName(name);
    }

    public void setPersonAge(int age){
        model.setAge(age);
    }

    public void updatePersonView(){
        view.updateView();
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
