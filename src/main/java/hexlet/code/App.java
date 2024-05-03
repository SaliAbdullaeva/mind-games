package hexlet.code;

import net.sf.saxon.lib.SaxonOutputKeys;
import net.sf.saxon.style.XSLOutput;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n " +
                "1 - Greet \n " +
                "0 - Exit");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Your choice:" + choice);
            Cli.greet();
        }
    }
}