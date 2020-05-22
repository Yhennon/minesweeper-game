package minesweeper.javafx.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameController {
   private int width;
   private int length;
   private int timer;
   private int bombCounter;


}
