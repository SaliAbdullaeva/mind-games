package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void game(int maxRounds) {
        String rule = "What number is missing in the progression?";
        final int accBound = 15;
        final int stepBound = 10;

        String[][] gameRounds = new String[maxRounds][2];

        final int progressionLength = 10;
        for (int i = 0; i < maxRounds; i++) {
            int acc = Utils.nextInt(accBound);
            int step = Utils.nextInt(1, stepBound);
            int unknown = Utils.nextInt(progressionLength);

            String[] progression = makeProgression(progressionLength, acc, step);

            gameRounds[i][1] = progression[unknown];
            progression[unknown] = "..";
            gameRounds[i][0] = String.join(" ", progression);
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static String[] makeProgression(int length, int acc, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(acc + i * step);
        }
        return progression;
    }

}
