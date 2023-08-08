package com.example.comp1008javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GradeCalcController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("gradeCalc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    @FXML
    private Label gradeAmount;

    @FXML
    private TextField scoreAmount;

    GradesModel model = new GradesModel();

    @FXML
    void initialize() {
        // Runs right before the stage is shown
        System.out.println("Start!");
    }

    @FXML
    void onConvert(ActionEvent event) {
        try {
            model.process(scoreAmount.getText());
        } catch (Exception e) {
            Utilities.createErrorAlert("Invalid Entry", e.getMessage()).show();
        } finally {
            gradeAmount.setText(model.getLetter());
        }
    }

    void onConvertOld(ActionEvent event) {
        double score = Double.parseDouble(scoreAmount.getText());

        if (score >=  80) {
            gradeAmount.setText("A");
        } else if (score >= 70) {
            gradeAmount.setText("B");
        } else if (score >= 60) {
            gradeAmount.setText("C");
        } else if (score >= 50) {
            gradeAmount.setText("D");
        } else if(score < 50) {
            gradeAmount.setText("F");
        }
    }

}
