package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.Engine;

public class Prime {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String name = Engine.getName();

        int correctAnswers = 0;
        String userAnswer;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");

        while (correctAnswers < 3) {
            int num = random.nextInt(100);
            boolean isPrime = isPrime(num); // Вызов метода isPrime перед циклом
            System.out.println("Question: " + num);

            System.out.println("Your choice: ");
            userAnswer = scanner.nextLine();
            
            if ((isPrime && userAnswer.equals("yes")) || (!isPrime && userAnswer.equals("no"))) { //проверка ответа пользователя
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                String wrongChoice = userAnswer.equals("yes") ? "no" : "yes";
                System.out.println("'" + userAnswer + "' is the wrong answer ;( Correct answer was '" + wrongChoice + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
    
    private static boolean isPrime(int num) {
        if (num <= 1) { //если число меньше 1, то оно не простое
            return false;
        } else if (num == 2) { //если число равное числу 2, то простое
            return true;
        } else if (num % 2 == 0) { //если число делится на 2 без остатка, то не простое
            return false;
        }
        return true;
    }
}


