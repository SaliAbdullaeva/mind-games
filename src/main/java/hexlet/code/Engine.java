package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner scanner = new Scanner(System.in);
    private static String playerName;

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? \n" +
                "Your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static String getUserInput() {
        return scanner.nextLine();
    }

    public static int getUserIntInput() {
        System.out.print("Your answer: ");
        return scanner.nextInt();
    }

    public static void showError(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
    }

    public static void congratulate() {
        System.out.println("Congratulations, " + playerName + "!");
    }
}
