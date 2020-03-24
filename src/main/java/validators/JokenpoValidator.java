package validators;

import models.Game;

import java.util.List;

public interface JokenpoValidator {
    Game returnWinner(List<Game> moves);
}
