package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calculator;
import hexlet.code.games.EvenOddGame;
import hexlet.code.games.Nod;
import hexlet.code.games.Progression;

public class Engine { //класс конструктор
    private static Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода
    private static String name; // Переменная для хранения имени пользователя

    public static void choice() {
        System.out.println("Please enter the game number and press Enter.\n "
                // Вывод списка игр
                + "1 - Greet \n "
                + "2 - Even \n "
                + "3 - Calc \n "
                + "4 - GCD \n "
                + "5 - Progression \n "
                + "0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt(); // Считывание выбора пользователя
        // Считывание символа новой строки из буфера
        scanner.nextLine();

        if (choice == 1) {
            greet();
        } else if (choice == 2) {
            greet();
            EvenOddGame.game();
        } else if (choice == 3) {
            greet();
            Calculator.game();
        }  else if (choice == 4) {
            greet();
            Nod.game();
        } else if (choice == 5) {
            greet();
            Progression.game();
        } else if (choice == 0) {
            System.out.println("Goodbye!");
        }
    }

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? \n" +
                        "Your name: ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
    public static String getName() {
        return name;
    }
}
