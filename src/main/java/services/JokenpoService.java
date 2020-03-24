package services;

import models.enums.JokenpoEnum;
import validators.JokenpoValidator;

import java.util.List;

public class JokenpoService {

    public String returnWinner(List<JokenpoEnum> plays) {
        if (plays.get(0).equals(plays.get(1))) {
            return "It was a tie! :(";
        }
        JokenpoValidator jokenpoValidator =  plays.get(0).getJokenpoValidator();
        return jokenpoValidator.returnWinner(plays);
    }
}
