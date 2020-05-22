package minesweeper.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MinesweeperApplication extends Application {




    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(MinesweeperApplication.class.getResource("/fxml/launch.fxml"));
        primaryStage.setTitle("Minesweeper");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
