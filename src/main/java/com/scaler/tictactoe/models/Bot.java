package com.scaler.tictactoe.models;

import com.scaler.tictactoe.strategies.botPlayingStrategies.BotPlayingStrategy;

public class Bot extends Player{

    private BotPlayingStrategy botPlayingStrategy;
    public Bot(Symbol symbol, BotPlayingStrategy botPlayingStrategy) {
        super(symbol, PlayerType.BOT);
        this.botPlayingStrategy = botPlayingStrategy;
    }
}
