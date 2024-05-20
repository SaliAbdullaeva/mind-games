package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static void game() {
        Engine.greet();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName(); // Запрашиваем имя пользователя
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            int num1 = Utils.getRandomInt(0, 99);
            int num2 = Utils.getRandomInt(0, 99);
            char operator = getRandomOperator();
            int result = calculate(num1, num2, operator);

            System.out.println("Question: " + num1 + " " + operator + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was  " + result + ".");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
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

