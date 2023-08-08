package com.example.comp1008javafx;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("calc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    CalculatorModel model = new CalculatorModel();

    @FXML
    private Label result;

    @FXML
    void green(MouseEvent event) {
        try {
            model.setOperand2(result.getText());
            model.setResult();
            result.setText(model.getResult() + "");
        } catch (Exception e) {
            Utilities.createErrorAlert("Error", e.getMessage()).show();
        }
    }

    @FXML
    void grey(MouseEvent event) {
        String currentValue = getEventText(event);
        String previousResultValue = result.getText();

        if(currentValue.equals(".") &&  previousResultValue.contains(".")) {
            return;
        }
        result.setText(previousResultValue + currentValue);
    }

    @FXML
    void orange(MouseEvent event) {
        try {
            model.setOperand1(result.getText());
            model.setOperator(getEventText(event));
            clearResult();
        } catch (Exception e) {
            Utilities.createErrorAlert("Error", e.getMessage()).show();
        }
    }

    void clearResult() {
        result.setText("");
    }


    String getEventText(MouseEvent event) {
        Pane pane = (Pane) event.getSource();
        ObservableList<Node> node = pane.getChildren();
        Label label = (Label)node.get(0);
        return label.getText();
    }

    @FXML
    void initialize() {
        // Runs right before the stage is shown
        clearResult();
    }

}

