package com.example.comp1008javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcome-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @FXML
    private TextField content;

    @FXML
    private ImageView imgCalculator;

    @FXML
    private ImageView imgGrades;

    @FXML
    private ImageView imgLogin;

    @FXML
    private ImageView imgSample;

    @FXML
    private ImageView imgSoccer;

    @FXML
    private Label result;

    @FXML
    void imgCalculatorMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgGradesMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgLoginMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgSampleMouseClicked(MouseEvent event) {

    }

    @FXML
    void imgSoccerMouseClicked(MouseEvent event) {

    }

    @FXML
    void onKeyPressed(KeyEvent event) {

    }

    @FXML
    void onSubmit(ActionEvent event) {

    }

}
