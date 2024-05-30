package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOddGame {

    public static void game(int maxRounds) {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int bound = 100;

        String[][] gameRounds = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            int number = Utils.nextInt(bound);

            gameRounds[i][0] = Integer.toString(number);
            gameRounds[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
