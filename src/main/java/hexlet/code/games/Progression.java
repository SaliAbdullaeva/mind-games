package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static void game() {
        Engine.greet();
        Scanner scanner = new Scanner(System.in);
        String name = Engine.getName();

        int correctAnswers = 0;

        for (var i = 0; i < 3; i++) { //цикл для повторения игры в случае правильного ответа

            // Генерация длины прогрессии от 5 до 10 чисел
            int progressionLength = Utils.getRandomInt(5, 10);

            // Генерация случайного начального числа и разности арифметической прогрессии
            int startNumber = Utils.getRandomInt(0, 99);
            int difference = Utils.getRandomInt(1, 10);

            // Генерация позиции скрытого числа
            int hiddenIndex = Utils.getRandomInt(0, progressionLength - 1);

            System.out.println("What number is missing in the progression?");
            System.out.println("Question: ");

            for (var j = 0; j < progressionLength; j++) { //цикл для генерации чисел прогрессии
                if (j == hiddenIndex) {
                    System.out.print(".. "); // Вывод двух точек вместо скрытого числа
                } else {
                    int number = startNumber + j * difference;
                    System.out.print(number + " ");
                }
            }
            System.out.println(); // Добавляем пустую строку после вывода прогрессии

            System.out.print("Your answer: "); //сюда
            int userAnswer = scanner.nextInt();

            int prg = startNumber + hiddenIndex * difference; // добавить скрытое значение

            // Проверяем ответ пользователя
            if (userAnswer == prg) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + prg + "'.");
                System.out.println("Let's try again, " + name + "!");
                return; // Завершаем игру после первого неправильного ответа
            }
        }
        // Поздравляем пользователя с победой
        if (correctAnswers == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

}
