package minesweeper.javafx.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class LaunchController {



    private FXMLLoader fxmlLoader;


    public void startAction(ActionEvent actionEvent) throws IOException {

        //fxmlLoader.setLocation(getClass().getResource("/fxml/game.fxml"));
        //Parent root = fxmlLoader.load();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/game.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
