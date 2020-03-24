package validators;

import models.Play;
import models.enums.JokenpoEnum;

import java.util.List;

public interface JokenpoValidator {
    Play returnWinner(List<Play> players);
}
