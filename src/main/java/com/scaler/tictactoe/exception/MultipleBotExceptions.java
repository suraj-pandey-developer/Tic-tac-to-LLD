package com.scaler.tictactoe.exception;

public class MultipleBotExceptions extends Exception{

    public MultipleBotExceptions() {
        super("A game cannot have more then one bot players");
    }
}
