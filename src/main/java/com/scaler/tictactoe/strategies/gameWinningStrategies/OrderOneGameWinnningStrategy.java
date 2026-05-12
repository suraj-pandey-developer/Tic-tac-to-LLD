package com.scaler.tictactoe.strategies.gameWinningStrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Cell;

public class OrderOneGameWinnningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkIfWin(Board board, Cell lastMoveCell) {
        return false;
    }
}
