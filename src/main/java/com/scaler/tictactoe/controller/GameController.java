package com.scaler.tictactoe.controller;


import com.scaler.tictactoe.exception.MultipleBotExceptions;
import com.scaler.tictactoe.exception.OperationExcecutionException;
import com.scaler.tictactoe.factories.PlayerFactory;
import com.scaler.tictactoe.models.*;
import com.scaler.tictactoe.strategies.botPlayingStrategies.RandomBotPlayingStrategy;
import com.scaler.tictactoe.strategies.gameWinningStrategies.GameWinningStrategy;
import com.scaler.tictactoe.strategies.gameWinningStrategies.OrderOneGameWinnningStrategy;

import java.util.List;

// start a game
// make a move
// undo
// check winner
// GetCurrentState
public class GameController {

    public Game createGame(int dimensionOfBoard, List<Player> players, List<GameWinningStrategy> strategies) throws OperationExcecutionException{
        try {
           return Game.create()
                    .withBoard(new Board(dimensionOfBoard))
                    .addPlayer(players)
                    .addGameWinnigStrategies(strategies)
                    .Build();
        } catch (Exception e) {
            System.out.println("We did something wrong ");
            e.printStackTrace();
            throw new OperationExcecutionException("could not create the game");
        }
    }

    public MoveResult makeMove(Game game, Move move) {
        return null;
    }

    public boolean undo(Game game) {
//        game.undo();
        return false;
    }

    public Player getWinner(Game game) {
        return null;
    }

    public GameStatus getGameStatus(Game game) {
        return GameStatus.IN_PROGRESS;
    }

}
