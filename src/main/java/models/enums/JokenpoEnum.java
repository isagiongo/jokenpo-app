package models.enums;

import validators.JokenpoValidator;
import validators.PaperValidator;
import validators.RockValidator;
import validators.ScissorsValidator;

import java.util.Arrays;
import java.util.List;

public enum JokenpoEnum {

    ROCK ("1", new RockValidator()),
    PAPER ("2", new PaperValidator()),
    SCISSORS ("3", new ScissorsValidator());

    private String prefix;
    private JokenpoValidator jokenpoValidator;

    private JokenpoEnum(String prefix, JokenpoValidator jokenpoValidator) {
        this.prefix = prefix;
        this.jokenpoValidator = jokenpoValidator;
    }

    public JokenpoValidator getJokenpoValidator() {
        return jokenpoValidator;
    }

    public static JokenpoEnum getFromPrefix(String prefix) {
        List<JokenpoEnum> listJokenpoEnum = Arrays.asList(values());
        return listJokenpoEnum.stream().filter(x -> x.prefix.equals(prefix)).findFirst().orElse(null);
    }

}
