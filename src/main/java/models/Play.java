package models;

import models.enums.JokenpoEnum;

public class Play {

    private String player;
    private JokenpoEnum play;

    public Play(String player, JokenpoEnum play) {
        this.player = player;
        this.play = play;
    }

    public String getPlayer() {
        return player;
    }

    public JokenpoEnum getPlay() {
        return play;
    }
}
