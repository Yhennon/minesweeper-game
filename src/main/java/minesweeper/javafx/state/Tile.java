package minesweeper.javafx.state;

import javafx.scene.control.Button;




public class Tile extends Button {
    private int width, height;
    private boolean hasBomb;
    private int bombsAround = 0;

    public Tile() {
        tileValue egy = tileValue.VALUE1;
       // System.out.println(Integer.parseInt(egy.name().substring(5))+3);
    }

    public enum tileValue{
        VALUE0,
        VALUE1,
        VALUE2,
        VALUE3,
        VALUE4,
        VALUE5,
        VALUE6,
        VALUE7,
        VALUE8,
        FLAGGED,
    }



}

