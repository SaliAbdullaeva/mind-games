package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void game(int maxRounds) {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final int bound = 100;

        String[][] gameRounds = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            int number = Utils.nextInt(bound);

            gameRounds[i][0] = Integer.toString(number);
            gameRounds[i][1] = (isPrime(number)) ? "yes" : "no";
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static boolean isPrime(int n) {
        // Corner case
        if (n <= 1) {
            return false;
        }
        // Check from 2 to sqrt(n)
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}