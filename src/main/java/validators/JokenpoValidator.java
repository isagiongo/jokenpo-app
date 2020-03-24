package validators;

import models.enums.JokenpoEnum;

import java.util.List;

public interface JokenpoValidator {
    String returnWinner(List<JokenpoEnum> players);
}
