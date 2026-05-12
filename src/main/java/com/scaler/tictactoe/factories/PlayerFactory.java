package com.scaler.tictactoe.factories;

import com.scaler.tictactoe.models.*;
import com.scaler.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;

public class PlayerFactory {

    public  static Player  getBot(Symbol symbol, BotPlayingStrategy botPlayingStrategy)  {
        return new Bot(symbol, botPlayingStrategy);
    }

    public  static Player  getHuman(Symbol symbol, User user)  {
        return new HumanPlayer(symbol, user);
    }

}
