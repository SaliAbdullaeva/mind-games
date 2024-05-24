package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Nod {
    public static void game() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        int correctAnswers = 0;

        for (int i = 0; i < 3; i++) {
            int num1 = Utils.getRandomInt(0, 99);
            int num2 = Utils.getRandomInt(0, 99);

            System.out.println("Question: " + num1 + " " + num2);

            int gcd = findGCD(num1, num2);

            if (!isAnswerCorrect(gcd)) {
                System.out.println("Let's try again, " + Engine.getPlayerName() + "!");
                return;
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

    private static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
