package validators;

import models.Game;
import models.enums.JokenpoEnum;

import java.util.List;

public class ScissorsValidator implements JokenpoValidator {

    @Override
    public Game returnWinner(List<Game> moves) {
        if (moves.stream().anyMatch(p -> p.getMove().equals(JokenpoEnum.PAPER))) {
            return moves.get(0);
        }
        return moves.get(1);
    }
}
