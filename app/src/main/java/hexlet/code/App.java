package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    private static final Scanner USER_INPUT = new Scanner(System.in);

    public static Scanner getUserInput() {
        return USER_INPUT;
    }

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        String userOption = USER_INPUT.nextLine();
        System.out.println();

        final int maxRounds = Engine.MAX_ROUNDS;
        switch (userOption) {
            case "1" -> Cli.greeting();
            case "2" -> EvenOddGame.game(maxRounds);
            case "3" -> Calculator.game(maxRounds);
            case "4" -> Nod.game(maxRounds);
            case "5" -> Progression.game(maxRounds);
            case "6" -> Prime.game(maxRounds);
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice!");
        }

    }

}