package validators;

import models.enums.JokenpoEnum;

import java.util.List;

public class ScissorsValidator implements JokenpoValidator {

    @Override
    public String returnWinner(List<JokenpoEnum> players) {
        if (players.stream().anyMatch(p -> p.equals(JokenpoEnum.PAPER))) {
            return "Scissors";
        }
        return null;    }
}
