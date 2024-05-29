package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static void game(int maxRounds) {
        String rule = "What is the result of the expression?";
        final int[] boundsArray = new int[] {100, 20};

        String[][] gameRounds = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            int[] numbers = Utils.nextIntArray(boundsArray);
            String operator = Utils.randomFromArray(new String[]{"+", "-", "*"});

            gameRounds[i][0] = numbers[0] + " " + operator + " " + numbers[1];
            gameRounds[i][1] = Integer.toString(calculate(numbers[0], numbers[1], operator));
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static int calculate(int a, int b, String operator) {
        switch (operator) {
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            default -> throw new RuntimeException("Invalid operator: '" + operator + "' !");
        }
    }
}