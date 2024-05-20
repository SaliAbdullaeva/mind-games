package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenOddGame {

    public static void game() {
        Engine.greet();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName(); // Запрашиваем имя пользователя
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctAnswersCount = 0;

        while (correctAnswersCount < 3) { //три попытки, три генерации числа
            int randomNumber = Utils.getRandomInt(-100, 100); // генерирует случайное число
            System.out.println("Question: " + randomNumber); // Вывод случайного числа

            boolean isEven = randomNumber % 2 == 0; // Проверка четности случайного числа
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
