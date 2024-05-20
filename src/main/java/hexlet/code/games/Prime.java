package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void game() {
        Engine.greet();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();

        int correctAnswers = 0;
        String userAnswer;

        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'");

        while (correctAnswers < 3) {
            int num =  Utils.getRandomInt(0, 99);
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
//если число меньше или равно 1, либо оно больше 2 и делится на 2 без остатка, то оно не простое
        if (num <= 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }
        return true;
    }
}


