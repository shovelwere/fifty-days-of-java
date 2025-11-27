package hangman;

public class Main {

    public static void main(String[] args) {
        char guessed;
        HangmanUI ui = new HangmanUI();
        HangmanGame game = new HangmanGame();
        String secretWord = game.getSecretWord();

        ui.printLogo();
        System.out.println("Let's play hangman!");

        while (!game.isLost() && !game.isWon()) {
            ui.printHangman(game.getLives());
            ui.printPlaceholder(game.getPlaceholder());
            guessed = ui.inputGuess();
            game.guess(guessed);
        }

        if (game.isWon()) {
            System.out.println("You won! The word was: " + secretWord);
        } else {
            ui.printHangman(game.getLives());
            System.out.println("You lost! The word was: " + secretWord);
        }

    }
}