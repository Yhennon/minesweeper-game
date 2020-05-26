package minesweeper.javafx.controller;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import lombok.Getter;
import lombok.Setter;
import minesweeper.javafx.state.Tile;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class GameController {


   private int rowNumber;
   private int columnNumber;
   private int mineNumber;
   private int difficultyLevel;

   @FXML
   private VBox root;

   @FXML
   private void initialize() {

      Platform.runLater(()->{createBoard();});
   }

   public void createBoard() {
      log.info("Game started.");
      HBox upperHBox = new HBox();
      upperHBox.setMinHeight(50);
      upperHBox.setPadding(new Insets(10,0,10,0));

      Label scoreLabel = new Label();
      scoreLabel.setText("Score: ");
      scoreLabel.setMinWidth(root.getWidth()/2.5);
      scoreLabel.setMaxWidth(root.getWidth()/2.5);
      scoreLabel.setAlignment(Pos.CENTER);

      Button newGameButton= new Button();
      newGameButton.setMinWidth(root.getWidth()/5);
      newGameButton.setMaxWidth(root.getWidth()/5);
      newGameButton.setAlignment(Pos.CENTER);

      Label timerLabel = new Label();
      timerLabel.setText("000");
      timerLabel.setMinWidth(root.getWidth()/2.5);
      timerLabel.setMaxWidth(root.getWidth()/2.5);
      timerLabel.setAlignment(Pos.CENTER);

      upperHBox.getChildren().addAll(scoreLabel,newGameButton,timerLabel);

      GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);
      root.getChildren().addAll(upperHBox,gridPane);

      for (int i = 0;i < rowNumber;i++) {
         for(int j = 0; j < columnNumber; j++){
            Tile button = new Tile();
            GridPane.setRowIndex(button,i);
            GridPane.setColumnIndex(button,j);
            gridPane.getChildren().add(button);
         }
      }

   }

   public void placeMines(){

   }

   public void placeValues(){

   }
}
