package org.chapter5AND6;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    String currentPlayer = "X";
    List<String> test = new ArrayList<>();
    public String getCurrentPlayer() {
        test.add(currentPlayer);
        return currentPlayer;
    }
    public String getNextPlayer() {
        while (test.size() < 2){
            getCurrentPlayer();
            String player = String.valueOf(test);
            String nextPlayer;
            switch (player){
                case "O":
                    nextPlayer = "X";
                    test.remove(0);
                    test.add(nextPlayer);
                    break;
                default:
                    nextPlayer = "O";
                    test.remove(0);
                    test.add(nextPlayer);
            }
            return test.get(0);
        }
        return test.get(0);
    }

}
