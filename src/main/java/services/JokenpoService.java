package services;

import models.Play;
import models.enums.JokenpoEnum;
import validators.JokenpoValidator;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class JokenpoService {

    public Play returnWinner(List<Play> plays) {
        if (!plays.get(0).getPlay().equals(plays.get(1).getPlay())) {
            JokenpoValidator jokenpoValidator =  plays.get(0).getPlay().getJokenpoValidator();
            return jokenpoValidator.returnWinner(plays);
        }
        return null;
    }
}
