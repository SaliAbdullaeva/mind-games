package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOddGame {

    public static void game() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;

        while (correctAnswersCount < 3) {
            int randomNumber = Utils.getRandomInt(-100, 100);
            System.out.println("Question: " + randomNumber);

            boolean isEven = randomNumber % 2 == 0;

            if (!isAnswerCorrect(isEven)) {
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                break;
            }
            correctAnswersCount++;
        }

        if (correctAnswersCount == 3) {
            Engine.congratulate();
        }
    }

    private static boolean isAnswerCorrect(boolean isEven) {
        String choice = Engine.getUserInput();
        System.out.println("Your answer: " + choice);

        if ((isEven && choice.equals("yes")) || (!isEven && choice.equals("no"))) {
            System.out.println("Correct!");
            return true;
        } else {
            String correctAnswer = isEven ? "yes" : "no";
            Engine.showError(choice, correctAnswer);
            return false;
        }
    }
}
