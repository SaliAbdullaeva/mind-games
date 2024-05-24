package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void game() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int progressionLength = Utils.getRandomInt(5, 10);
            int startNumber = Utils.getRandomInt(0, 99);
            int difference = Utils.getRandomInt(1, 10);
            int hiddenIndex = Utils.getRandomInt(0, progressionLength - 1);

            int[] progression = generateProgression(startNumber, difference, progressionLength);
            String question = createQuestion(progression, hiddenIndex);

            System.out.println("Question: " + question);

            int correctAnswer = progression[hiddenIndex];

            if (!isAnswerCorrect(correctAnswer)) {
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                break;
            }
            correctAnswers++;
        }

        if (correctAnswers == 3) {
            Engine.congratulate();
        }
    }

    private static boolean isAnswerCorrect(int correctAnswer) {
        int userAnswer = Engine.getUserIntInput();

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
            return true;
        } else {
            Engine.showError(String.valueOf(userAnswer), String.valueOf(correctAnswer));
            return false;
        }
    }

    private static int[] generateProgression(int startNumber, int difference, int length) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = startNumber + i * difference;
        }
        return progression;
    }

    private static String createQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == hiddenIndex) {
                question.append(".. ");
            } else {
                question.append(progression[i]).append(" ");
            }
        }
        return question.toString().trim();
    }
}
