package com.scaler.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public  Board(int dimension) {
        this.dimension =  dimension;
        board = new ArrayList<>();
    }


}
