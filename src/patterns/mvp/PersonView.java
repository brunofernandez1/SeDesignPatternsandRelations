package patterns.mvp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonView {

    JFrame mainFrame;
    JTextField textField;
    PersonController controller;

    public PersonView(){

        JFrame mainFrame = new JFrame("MVP JFRAME");
        mainFrame.setSize(500, 500);
        JTextField textField = new JTextField("this is a textfield");
        JPanel leftPanel = new JPanel();
        leftPanel.add(textField);


        JButton button = new JButton("this is a button");
        button.addActionListener(e -> controller.actionPerformed(e));
        JPanel rightPanel = new JPanel();
        rightPanel.add(button);

        JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitpane.setLeftComponent(leftPanel);
        splitpane.setRightComponent(rightPanel);
        mainFrame.add(splitpane);


        //set visible just at the end
        mainFrame.setVisible(true);

    }

    public void updateView(){
        textField.setText("Person was updated");
    }

    public void addController(PersonController controller){
        this.controller = controller;
    }


}
