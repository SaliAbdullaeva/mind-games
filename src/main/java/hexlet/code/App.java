package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

 //Класс для выбора игры

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> Cli.greet();
            case 2 -> EvenOddGame.game();
            case 3 -> Calculator.game();
            case 4 -> Nod.game();
            case 5 -> Progression.game();
            case 6 -> Prime.game();
            case 0 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice!");
        }
    }
}

