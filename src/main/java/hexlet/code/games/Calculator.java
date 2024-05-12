package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.Engine;

public class Calculator {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = Engine.getName(); // Запрашиваем имя пользователя

        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);
            char operator = getRandomOperator(random);
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

    private static char getRandomOperator(Random random) {
        char[] operators = {'+', '-', '*'};
        return operators[random.nextInt(operators.length)];
    }

    private static int calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
