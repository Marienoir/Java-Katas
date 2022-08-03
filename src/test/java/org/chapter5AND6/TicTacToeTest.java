package org.chapter5AND6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void whenTheGameStartsItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getCurrentPlayer();
        assertEquals("X", expectedValue);
    }

    @Test
    void whenPlayerXMakesAMoveItShouldBePlayerOTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getNextPlayer();
        assertEquals("O", expectedValue);
    }

    @Test
    void whenPlayerOMakesAMoveItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.getNextPlayer();
        String expectedValue = ticTacToe.getNextPlayer();
        assertEquals("X", expectedValue);
    }
}
