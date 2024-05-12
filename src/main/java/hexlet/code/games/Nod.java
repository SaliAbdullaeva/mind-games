package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.Engine;

public class Nod {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = Engine.getName();

        int correctAnswers = 0;

        System.out.println("Find the greatest common divisor of given numbers.");

        for (var i = 0; i < 3; i++) {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            System.out.println("Question: " + num1 + " " + num2);
            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();
            // Вычисляем НОД чисел
            int gcd = findGCD(num1, num2);

            // Проверяем ответ пользователя
            if (userAnswer == gcd) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + gcd + "'.");
                System.out.println("Let's try again, " + name + "!");
                return; // Завершаем игру после первого неправильного ответа
            }
        }

        // Поздравляем пользователя с победой
        System.out.println("Congratulations, " + name + "!");

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
