package com.example.asgn2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
   @FXML
    private Button getStarted;


    @FXML
    public void getStartedButtonClicked() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GameSystem.fxml"));
            Parent root = loader.load();
            Scene nextScene = new Scene(root);
            Stage stage = (Stage) getStarted.getScene().getWindow();
            stage.setScene(nextScene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}