package validators;

import models.Play;
import models.enums.JokenpoEnum;

import java.util.List;

public class PaperValidator implements JokenpoValidator {

    @Override
    public Play returnWinner(List<Play> players) {
        if (players.stream().anyMatch(p -> p.getPlay().equals(JokenpoEnum.ROCK))) {
            return players.get(0);
        }
        return players.get(1);
    }
}
