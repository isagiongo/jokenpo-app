package validators;

import models.enums.JokenpoEnum;

import java.util.Comparator;
import java.util.List;

public class RockValidator implements JokenpoValidator {

    @Override
    public String returnWinner(List<JokenpoEnum> players) {
        if (players.stream().anyMatch(p -> p.equals(JokenpoEnum.SCISSORS))) {
           return "Rock";
        }
        return null;
    }
}
