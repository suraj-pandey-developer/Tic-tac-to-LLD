package com.scaler.tictactoe.models;

public class HumanPlayer extends Player{
    private User user;
    public HumanPlayer(Symbol symbol, User user) {
        super(symbol, PlayerType.HUMAN);
        this.user = user;
    }
}
