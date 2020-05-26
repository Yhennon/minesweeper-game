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

import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.lang.model.SourceVersion;

@Slf4j
public class LaunchController {

    private int rowNumber = 0;
    private int columnNumber = 0;
    private int mineNumber = 0;
    private int difficultyLevel = 0;


    @Inject
    private FXMLLoader fxmlLoader;

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
        log.info("The game difficulty is set to Easy. " +
                "The number of rows is {}, " +
                "the number of columns is {}, " +
                "The number of mines is {}",rowNumber,columnNumber,mineNumber);
    }

    public void chooseMediumGame(ActionEvent choose_medium_game) {
        difficultyErrorLabel.setText("");
        rowNumber = 16;
        columnNumber = 16;
        mineNumber = 40;
        difficultyLevel = 2;
        log.info("The game difficulty is set to Medium. " +
                "The number of rows is {}, " +
                "the number of columns is {}, " +
                "The number of mines is {}",rowNumber,columnNumber,mineNumber);
    }

    public void chooseHardGame(ActionEvent choose_hard_game) {
        difficultyErrorLabel.setText("");
        rowNumber = 16;
        columnNumber = 30;
        mineNumber = 99;
        difficultyLevel = 3;
        log.info("The game difficulty is set to Hard. " +
                "The number of rows is {}, " +
                "the number of columns is {}, " +
                "The number of mines is {}",rowNumber,columnNumber,mineNumber);
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
            difficultyErrorLabel.setText("Please choose a difficulty first!");
        }else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/test.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<GameController>getController().setRowNumber(rowNumber);
            fxmlLoader.<GameController>getController().setColumnNumber(columnNumber);
            fxmlLoader.<GameController>getController().setDifficultyLevel(difficultyLevel);
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            switch (difficultyLevel){
                case 1:
                    stage.setScene(new Scene(root,270+20,270+50));
                    stage.show();
                    break;
                case 2:
                    stage.setScene(new Scene(root,480,480));
                    stage.show();
                    break;
                case 3:
                    stage.setScene(new Scene(root,900,480));
                    stage.show();
                    break;
            }

        }
        log.info("Starting game...");
    }


}
