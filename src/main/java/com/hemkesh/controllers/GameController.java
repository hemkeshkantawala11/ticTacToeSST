package com.hemkesh.controllers;



import com.hemkesh.Models.Game;
import com.hemkesh.Models.GameState;
import com.hemkesh.Models.Player;
import com.hemkesh.exceptions.InvalidMoveException;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) {

        //if 2 player have same symbol then throw exception

        return new Game(dimension, players);
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public GameState checkState(Game game) {
        return game.getGameState();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void printBoard(Game game) {
        game.printBoard();
    }

}
