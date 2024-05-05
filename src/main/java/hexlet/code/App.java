package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания ввода
        System.out.println("Please enter the game number and press Enter.\n "
                + "1 - Greet \n "
                + "2 - Even \n "
                + "0 - Exit"); // Вывод списка игр
        System.out.println("Your choice: ");

        int choice = scanner.nextInt(); // Считывание выбора пользователя
        if (choice == 1) { // Если выбрано "Приветствие"
            System.out.println("Your choice:" + choice); //сообщаем пользователю о его выборе
            Cli.greet(); // Вызов метода приветствия из класса EvenOddGame
        } else if (choice == 2) { //Если выбрана игра "Проверка на чётность"
            System.out.println("Your choice:" + choice); // также сообщаем о выборе
            EvenOddGame.game(); //приветсвие также вызываем перед тем как начнем игру
        } else if (choice == 0) { //Если выбрал выход
            System.out.println("Goodbye!");
        }
    }
}
