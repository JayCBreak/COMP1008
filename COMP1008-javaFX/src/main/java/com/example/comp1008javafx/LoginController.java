package com.example.comp1008javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.concurrent.ExecutionException;

public class LoginController {

    @FXML
    private Label errorText;

    @FXML
    private PasswordField pwd;

    @FXML
    private TextField uname;

    @FXML
    void onLogin(ActionEvent event) {
        String username = uname.getText();
        String password = pwd.getText();
        errorText.setText("");

        if(username.equals("admin") && password.equals("pass")) {
            System.out.println("Success");
            try{
                Utilities.openWindow("soccer", "Soccer");
                Node node = (Node)event.getSource();
                Scene scene = node.getScene();
                Stage stage = ((Stage)scene.getWindow());
                stage.close();
            } catch (Exception e){
                Utilities.createErrorAlert("Error!", "Cannot open view");
            }
        } else {
            errorText.setText("ERROR: Incorrect Login");
        }
    }

    @FXML
    void onRegister(ActionEvent event) {
        uname.setText("Hello");
        pwd.setText("World");
    }

}
