package hexlet.code;

import java.util.Scanner;

public class Engine { //класс конструктор
    private static Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода
    private static String name; // Переменная для хранения имени пользователя

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
