import models.enums.JokenpoEnum;
import services.JokenpoService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class JokenpoInterface {

    private static JokenpoService jokenpoService;

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String optionRepeat;
            boolean repeat = false;

            System.out.println("--------------------------------------------------------------------");
            System.out.println("Play Jokenpo alone (And for now, stay at home)");
            System.out.println("--------------------------------------------------------------------\n");

            returnWinner();

            do {
                System.out.println("Would you like to play again? Type y to continue and n to exit ");
                optionRepeat = reader.readLine();
                if (optionRepeat.toLowerCase().equals("y")) {
                    returnWinner();
                    repeat = true;
                } else if (optionRepeat.toLowerCase().equals("n")) {
                    repeat = false;
                    System.out.println("--------------------------------------------");
                    System.out.println("Bye and take care :) #StayAtThefuckingHome");
                    System.out.println("--------------------------------------------\n");
                } else {
                    System.out.println("It is not a valid option. Please type again.");
                    repeat = true;
                }
            } while ((repeat));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void returnWinner() throws IOException {
        jokenpoService = new JokenpoService();

        List<JokenpoEnum> plays = readPlays();
        System.out.println("------------------------------------------------------");
        System.out.println("The winner is: " + jokenpoService.returnWinner(plays));
        System.out.println("------------------------------------------------------\n");
    }

    private static List<JokenpoEnum> readPlays() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        JokenpoEnum playerOne;
        JokenpoEnum playerTwo;
        boolean isValid;

        do {
            System.out.println("Player One, Enter 1 for Rock, 2 for Paper or 3 for Scissors:  ");
            playerOne = JokenpoEnum.getFromPrefix(reader.readLine());
            System.out.println("Player Two, Enter 1 for Rock, 2 for Paper or 3 for Scissors:  ");
            playerTwo = JokenpoEnum.getFromPrefix(reader.readLine());

            if (isPlayValid(playerOne) && isPlayValid(playerTwo)) {
                isValid = true;
            } else {
                System.out.println("It is not a valid option. Please type again.");
                isValid = false;
            }
        }
        while (!(isValid));

        return Arrays.asList(playerOne, playerTwo);
    }

    private static boolean isPlayValid(JokenpoEnum play) {
        return Objects.nonNull(play) && (play.equals(JokenpoEnum.ROCK)
                || play.equals(JokenpoEnum.PAPER) || play.equals(JokenpoEnum.SCISSORS));
    }
}
