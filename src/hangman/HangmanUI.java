package hangman;

import java.util.Scanner;

public class HangmanUI {

    private final String LOGO = """
            $$\\   $$\\
            $$ |  $$ |
            $$ |  $$ | $$$$$$\\  $$$$$$$\\   $$$$$$\\  $$$$$$\\\\$$$$\\   $$$$$$\\  $$$$$$$\\
            $$$$$$$$ | \\____$$\\ $$  __$$\\ $$  __$$\\ $$  _$$  _$$\\  \\____$$\\ $$  __$$\\
            $$  __$$ | $$$$$$$ |$$ |  $$ |$$ /  $$ |$$ / $$ / $$ | $$$$$$$ |$$ |  $$ |
            $$ |  $$ |$$  __$$ |$$ |  $$ |$$ |  $$ |$$ | $$ | $$ |$$  __$$ |$$ |  $$ |
            $$ |  $$ |\\$$$$$$$ |$$ |  $$ |\\$$$$$$$ |$$ | $$ | $$ |\\$$$$$$$ |$$ |  $$ |
            \\__|  \\__| \\_______|\\__|  \\__| \\____$$ |\\__| \\__| \\__| \\_______|\\__|  \\__|
                                          $$\\   $$ |
                                          \\$$$$$$  |
                                           \\______/
            """;
    private final String[] HANGMANPICS = {
            """
                      +---+
                      |   |
                          |
                          |
                          |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                          |
                          |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                      |   |
                          |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                     /|   |
                          |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                     /|\\  |
                          |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                     /|\\  |
                     /    |
                          |
                    =========
                    """,
            """
                      +---+
                      |   |
                      O   |
                     /|\\  |
                     / \\  |
                          |
                    =========
                    """
    };

    Scanner scanner = new Scanner(System.in);

    public void printHangman(int remainingLives) {

        System.out.println("\n\n" + HANGMANPICS[HANGMANPICS.length - (remainingLives)]);

    }

    public void printLogo(){
        System.out.println(LOGO);
    }

    public char inputGuess() {
        String input;
        do {
            System.out.print("\n\nGuess a letter: ");
            input = scanner.nextLine().trim();
        } while (input.length() != 1 || !Character.isLetter(input.charAt(0)));
        return input.charAt(0);
    }

    public void printPlaceholder(String placeholder) {
        for (int i = 0; i < placeholder.length(); i++) {
            System.out.print(placeholder.toCharArray()[i] + " ");
        }
    }

}
