package patterns.mvp;

import javax.swing.*;

public class MVPTester {

    public static void main(String[] args) {

        PersonModel model = createUser();
        PersonView view = new PersonView();

        PersonController controller = new PersonController(model, view);
    }

    public static PersonModel createUser(){
        PersonModel customModel = new PersonModel("Bruno",28);
        return customModel;
    }
}
