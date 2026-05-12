package com.scaler.tictactoe.models;

import com.scaler.tictactoe.exception.MultipleBotExceptions;
import com.scaler.tictactoe.strategies.gameWinningStrategies.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> gameWinningStrategies;
    private int lastMovedPlayerIndex;
    private GameStatus gameStatus;
    private Player winner;

    public static GameBuilder create() {
        return new GameBuilder();
    }
    public static class GameBuilder {
        private List<Player> players =  new ArrayList<>();
        private Board board;
        private List<Move> moves;
        private List<GameWinningStrategy> gameWinningStrategies = new ArrayList<>();
        private int lastMovedPlayerIndex;
        private GameStatus gameStatus;
        private Player winner;


        public GameBuilder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public GameBuilder addPlayer(List<Player> players) {
            for(Player player : players) {
                this.players.add(player);
            }
            return this;
        }

        public GameBuilder withBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder addGameWinnigStrategies(GameWinningStrategy gameWinningStrategy) {
            this.gameWinningStrategies.add(gameWinningStrategy);
            return this;
        }

        public GameBuilder addGameWinnigStrategies(List<GameWinningStrategy> gameWinningStrategys) {
            for(GameWinningStrategy gameWinningStrategy : gameWinningStrategys) {
                this.gameWinningStrategies.add(gameWinningStrategy);
            }
            return this;
        }

        private boolean checkIfSingleBotMax() {
            int count = 0;
            for (Player player : players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    count += 1;
                }
            }
            return count <= 1;
        }


//        public void undo() {
//
//        }

        public Game Build() throws MultipleBotExceptions {
            // validation rules will be here
            if(!checkIfSingleBotMax()) {
                throw new MultipleBotExceptions();
            }
            return null;
        }
    }
}



/**
 * Start Game
 * Give # of Players
 * Human Email phoneno  symbol
 * Bot StarategyType
 * Dimension Of Board
 * Winning Starategies
 * this will lead to certain of Game object
 * Builder to be used for Game
 * Game(int n, List<Player>, staragies)
 *
 *
 *
 *
 * */
