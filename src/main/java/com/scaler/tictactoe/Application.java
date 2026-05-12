package com.scaler.tictactoe;

import com.scaler.tictactoe.factories.PlayerFactory;
import com.scaler.tictactoe.models.*;
import com.scaler.tictactoe.strategies.botPlayingStrategies.RandomBotPlayingStrategy;
import com.scaler.tictactoe.strategies.gameWinningStrategies.GameWinningStrategy;
import com.scaler.tictactoe.strategies.gameWinningStrategies.OrderOneGameWinnningStrategy;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Player> playerList = List.of(
                PlayerFactory.getHuman(new Symbol('X'), new User()),
                PlayerFactory.getBot(new Symbol('O'), new RandomBotPlayingStrategy())
        );

        List<GameWinningStrategy> gameWinningStrategies = List.of(
                new OrderOneGameWinnningStrategy()
        );


        Game game;
        try {
             game = Game.create()
                    .withBoard(new Board(3))
                    .addPlayer(PlayerFactory.getHuman(new Symbol('X'), new User()))
                    .addPlayer(PlayerFactory.getBot(new Symbol('O'), new RandomBotPlayingStrategy()))
                    .addGameWinnigStrategies(new OrderOneGameWinnningStrategy())
                    .Build();
        } catch (Exception e) {
            System.out.println("We did something wrong ");
            e.printStackTrace();
        }
    }
}




/**
 * Start Game
 * Give # of Players
 * Human Email phoneno  symbol
 * Bot Starategy Type
 * Dimension Of Board
 * Winning Starategies
 * this will lead to certain of Game object
 * Builder to be used for Game
 * Game(int n, List<Player>, stargies)
 *
 *
 *  Board withBoard(BoardFactory.getBoardWithDimension(n))
 *  Board.create().withDimension().build()
 *  Board.ofDimension(n)
 * */