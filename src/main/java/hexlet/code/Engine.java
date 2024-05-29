package hexlet.code;

public class Engine {

    public static final int MAX_ROUNDS = 3;

    public static void beginGame(String rule, String[][] gameRounds) {
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        String username = App.getUserInput().nextLine();
        System.out.println("Hello, " + username + "!");

        System.out.println(rule);

        for (int i = 0; i < MAX_ROUNDS; i++) {
            String expression = gameRounds[i][0];
            String expected = gameRounds[i][1];

            System.out.println("Question: " + expression);
            System.out.print("Your answer: ");
            String answer = App.getUserInput().nextLine();

            if (!expected.equals(answer)) {
                System.out.println("'" + answer + "'"
                        + " is wrong answer ;(. Correct answer was "
                        + "'" + expected + "'");
                System.out.println("Let's try again, " + username + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + username + "!");
    }

}