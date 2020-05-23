package minesweeper.javafx.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class LaunchController {

    private static int rowNumber = 0;
    private static int columnNumber = 0;
    private static int mineNumber = 0;
    private static int difficultyLevel = 0;


    @FXML
    private TextField playerNameTextField;

    @FXML
    private Label playerNameErrorLabel;

    @FXML
    private Label difficultyErrorLabel;

    public void chooseEasyGame(ActionEvent choose_easy_game) {
        difficultyErrorLabel.setText("");
        rowNumber = 9;
        columnNumber = 9;
        mineNumber = 10;
        difficultyLevel = 1;
        //TODO logolás ("Set to Medium"+rowNumber+columnNumber+mineNumber);
    }

    public void chooseMediumGame(ActionEvent choose_medium_game) {
        difficultyErrorLabel.setText("");
        rowNumber = 16;
        columnNumber = 16;
        mineNumber = 40;
        difficultyLevel = 2;
        //TODO logolás ...
    }

    public void chooseHardGame(ActionEvent choose_hard_game) {
        difficultyErrorLabel.setText("");
        rowNumber = 30;
        columnNumber = 16;
        mineNumber = 99;
        difficultyLevel = 3;
        //TODO logolás ...
    }



    public void startAction(ActionEvent actionEvent) throws IOException {

        if(playerNameTextField.getText().isEmpty()){
            playerNameErrorLabel.setWrapText(true);
            playerNameErrorLabel.setMaxWidth(100);
            playerNameErrorLabel.setText("Please enter your player name first!");
        } else if(difficultyLevel == 0) {
            playerNameErrorLabel.setText("");
            difficultyErrorLabel.setWrapText(true);
            difficultyErrorLabel.setMaxWidth(120);
            difficultyErrorLabel.setText("Please choose a difficulity first!");
        }else {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/game.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }

    }

}
