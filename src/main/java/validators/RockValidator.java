package validators;

import models.Play;
import models.enums.JokenpoEnum;

import java.util.Comparator;
import java.util.List;

public class RockValidator implements JokenpoValidator {

    @Override
    public Play returnWinner(List<Play> players) {
        if (players.stream().anyMatch(p -> p.getPlay().equals(JokenpoEnum.SCISSORS))) {
            return players.get(0);
        }
        return players.get(1);
    }
}
