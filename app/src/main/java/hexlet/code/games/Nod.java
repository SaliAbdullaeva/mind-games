package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Nod {

    public static void game(int maxRounds) {
        String rule = "Find the greatest common divisor of given numbers.";
        final int bound = 100;

        String[][] gameRounds = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            int[] numbers = Utils.nextIntArray(2, bound);

            gameRounds[i][0] = numbers[0] + " " + numbers[1];
            gameRounds[i][1] = Integer.toString(getGcd(numbers[0], numbers[1]));
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static int getGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}