package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void game() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int correctAnswers = 0;

        while (correctAnswers < 3) {
            int num = Utils.getRandomInt(0, 99);
            System.out.println("Question: " + num);
            boolean isPrime = isPrime(num);

            if (!isAnswerCorrect(isPrime)) {
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                break;
            }
            correctAnswers++;
        }

        if (correctAnswers == 3) {
            Engine.congratulate();
        }
    }

    private static boolean isAnswerCorrect(boolean isPrime) {
        String choice = Engine.getUserInput();
        System.out.println("Your answer: " + choice);

        if ((isPrime && choice.equals("yes")) || (!isPrime && choice.equals("no"))) {
            System.out.println("Correct!");
            return true;
        } else {
            String correctAnswer = isPrime ? "yes" : "no";
            Engine.showError(choice, correctAnswer);
            return false;
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
