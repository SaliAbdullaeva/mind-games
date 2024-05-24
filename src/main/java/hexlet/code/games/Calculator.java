package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static void game() {
        Engine.greet();
        System.out.println("What is the result of the expression?");

        int correctAnswers = 0;

        for (int i = 0; i < 3; i++) {
            int num1 = Utils.getRandomInt(0, 99);
            int num2 = Utils.getRandomInt(0, 99);
            char operator = getRandomOperator();
            int result = calculate(num1, num2, operator);

            System.out.println("Question: " + num1 + " " + operator + " " + num2);

            if (!isAnswerCorrect(result)) {
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

    private static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        return operators[Utils.getRandomInt(0, operators.length - 1)];
    }

    private static int calculate(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
