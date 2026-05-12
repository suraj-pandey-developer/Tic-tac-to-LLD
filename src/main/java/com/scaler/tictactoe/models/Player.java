package com.scaler.tictactoe.models;

public abstract class Player {

    private Symbol symbol;
    private PlayerType playerType;

    Player(Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public Symbol getSymbol() {
        return this.symbol;
    }

}
