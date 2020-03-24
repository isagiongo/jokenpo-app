package models;

import models.enums.JokenpoEnum;

public class Game {

    private String player;
    private JokenpoEnum move;

    public Game(String player, JokenpoEnum move) {
        this.player = player;
        this.move = move;
    }

    public String getPlayer() {
        return player;
    }

    public JokenpoEnum getMove() {
        return move;
    }
}
