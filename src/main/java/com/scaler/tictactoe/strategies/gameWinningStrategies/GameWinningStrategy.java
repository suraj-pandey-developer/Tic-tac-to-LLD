package com.scaler.tictactoe.strategies.gameWinningStrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Cell;

public interface GameWinningStrategy {
    boolean checkIfWin(Board board, Cell lastMoveCell);
}
