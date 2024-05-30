package hexlet.code;

public class Cli {

    public static void greeting() {
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        String username = App.getUserInput().nextLine();
        System.out.println("Hello, " + username + "!");
    }

}
