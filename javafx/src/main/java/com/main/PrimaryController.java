package com.main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class PrimaryController implements Initializable{
    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        choiceBox.getItems().addAll("Portão 1", "Portão 2", "Portão 3");
    }
     

    @FXML
    private void choiceBox() {

    }
    
}
