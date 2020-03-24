package validators;

import models.Game;
import models.enums.JokenpoEnum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JokenpoValidatorTest {

    private JokenpoValidator paperValidator;
    private JokenpoValidator rockValidator;
    private JokenpoValidator scissorsValidator;

    @BeforeEach
    void setUp() {
        paperValidator = new PaperValidator();
        rockValidator = new RockValidator();
        scissorsValidator = new ScissorsValidator();
    }

    @Test
    void shouldReturnPaperWinnerVsRock() {
        Game playerOne = new Game("playerOne", JokenpoEnum.PAPER);
        Game playerTwo = new Game("playerTwo", JokenpoEnum.ROCK);

        List<Game> moves = Arrays.asList(playerOne, playerTwo);

        Game winnerReturned = paperValidator.returnWinner(moves);

        assertEquals("playerOne", winnerReturned.getPlayer());
        assertEquals(JokenpoEnum.PAPER, winnerReturned.getMove());
    }

    @Test
    void shouldReturnRockWinnerVsScissors() {
        Game playerOne = new Game("playerOne", JokenpoEnum.ROCK);
        Game playerTwo = new Game("playerTwo", JokenpoEnum.SCISSORS);

        List<Game> moves = Arrays.asList(playerOne, playerTwo);

        Game winnerReturned = rockValidator.returnWinner(moves);

        assertEquals("playerOne", winnerReturned.getPlayer());
        assertEquals(JokenpoEnum.ROCK, winnerReturned.getMove());
    }

    @Test
    void shouldReturnScissorsWinnerVsPaper() {
        Game playerOne = new Game("playerOne", JokenpoEnum.SCISSORS);
        Game playerTwo = new Game("playerTwo", JokenpoEnum.PAPER);

        List<Game> moves = Arrays.asList(playerOne, playerTwo);

        Game winnerReturned = scissorsValidator.returnWinner(moves);

        assertEquals("playerOne", winnerReturned.getPlayer());
        assertEquals(JokenpoEnum.SCISSORS, winnerReturned.getMove());
    }
}