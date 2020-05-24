package minesweeper.javafx.controller;


import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import lombok.Getter;
import lombok.Setter;
import javafx.event.ActionEvent;
import org.checkerframework.framework.qual.FromByteCode;


@Getter
@Setter
public class GameController {
   private static int timer;


   private int rowNumber;
   private int columnNumber;
   private int mineNumber;



   @FXML
   private GridPane gridPane;

   @FXML
   private void initialize() {
      Platform.runLater(() -> {placeButtons();});
   }

   @FXML
   private void placeButtons(){
      System.out.println("rowNumber = " + rowNumber);
      System.out.println("columnNumber = " + columnNumber);

      for (int i = 0;i < rowNumber;++i) {
         for(int j = 0; j < columnNumber; ++j){
            Button button = new Button();
            GridPane.setRowIndex(button,i);
            GridPane.setColumnIndex(button,j);
            gridPane.getChildren().add(button);
         }
      }
   }
}
