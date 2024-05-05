package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenOddGame {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;
        while (correctAnswersCount < 3) { //три попытки, три генерации числа
            int randomNumber = random.nextInt(1000); // генерирует случайное число от 0 до 999
            System.out.println("Question: " + randomNumber); // Вывод случайного числа
            boolean isEven = randomNumber % 2 == 0; // Проверка четности случайного числа
            //boolean isNotEven = randomNumber % 2 != 0; //проверка на нечетность
            var choice = scanner.nextLine(); // Считывание выбора пользователя
            System.out.println("Your answer: " + choice);
            // проверяем соответсвует ответ правильному варианту
            if ((isEven && choice.equals("yes")) || (!isEven && choice.equals("no"))) {
                System.out.println("Correct!");
                correctAnswersCount++;
            } else { // Выбор правильного ответа в зависимости от неправильного выбора пользователя
                String wrongChoice = choice.equals("yes") ? "no" : "yes";
                System.out.println("'" + choice + "' is the wrong answer ;( Correct answer was '" + wrongChoice + "'.");
                System.out.println("Let's try again, " + name + "!");
                break; // завершаем игру после неправильного ответа
            }
            if (correctAnswersCount == 3) {
                System.out.println("Congratulations, " + name + "!");
            }
        }
    }
}
