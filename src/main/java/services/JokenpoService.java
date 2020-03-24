package services;

import models.Game;
import validators.JokenpoValidator;

import java.util.List;

public class JokenpoService {

    public Game returnWinner(List<Game> plays) {
        if (!plays.get(0).getMove().equals(plays.get(1).getMove())) {
            JokenpoValidator jokenpoValidator =  plays.get(0).getMove().getJokenpoValidator();
            return jokenpoValidator.returnWinner(plays);
        }
        return null;
    }
}
