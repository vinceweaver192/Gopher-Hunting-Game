package edu.uic.cs478.ThreadingWithHandlers;

import android.widget.Button;

import java.util.LinkedList;

public class GameLogic {

    // true when game has won
    private boolean gameOver = false;
    // list of the number corresponding to a button
    private LinkedList<Integer> adjLists[];
    private LinkedList<Button> buttonList[];


    // methods
    public boolean checkGameOver() {
        if (gameOver == true){
            return true;
        }
        else {
            return false;
        }
    }
}
