package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        choice(); // Вызываем метод выбора игры при запуске программы
    }
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n "
                // Вывод списка игр
                + "1 - Greet \n "
                + "2 - Even \n "
                + "3 - Calc \n "
                + "4 - GCD \n "
                + "5 - Progression \n "
                + "6 - Prime \n"
                + " 0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt(); // Считывание выбора пользователя
        // Считывание символа новой строки из буфера
        scanner.nextLine();

        if (choice == 1) {
            Engine.greet();
        } else if (choice == 2) {
            EvenOddGame.game();
        } else if (choice == 3) {
            Calculator.game();
        }  else if (choice == 4) {
            Nod.game();
        } else if (choice == 5) {
            Progression.game();
        } else if (choice == 6) {
            Prime.game();
        } else if (choice == 0) {
            System.out.println("Goodbye!");
        }
    }
}

