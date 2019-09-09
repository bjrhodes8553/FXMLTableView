package sample;

import javafx.fxml.FXML;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class FXMLTableViewController {
    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML
    protected void addPerson(Action event){
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person(firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));
        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }

    public void addPerson(ActionEvent actionEvent) {
    }


}
