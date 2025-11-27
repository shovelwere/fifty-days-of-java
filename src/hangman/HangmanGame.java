package hangman;

import java.util.ArrayList;

public class HangmanGame {
    private WordProvider wp = new WordProvider();
    private final String randomWord;
    private int remainingLives;
    private String placeholder;
    private ArrayList<Integer> letterIndex = new ArrayList<Integer>();


    public HangmanGame() {
        randomWord = wp.getRandomWord();
        remainingLives = 7;
        placeholder = generatePlaceholder(randomWord);
    }
    
    private String generatePlaceholder(String word) {
        String placeholder = "";
        for (int i = 0; i < word.length(); i++) {
            placeholder = placeholder.concat("_");
        }
        return placeholder;
    }

    public void guess(char guessed) {
        if (randomWord.contains(String.valueOf(guessed))) {

            for (int i = 0; i < randomWord.length(); i++) {
                if (randomWord.charAt(i) == guessed) {
                    letterIndex.add(i);
                }
            }
            StringBuilder sb = new StringBuilder(placeholder);
            for (int i : letterIndex) {
                sb.setCharAt(i, guessed); 
            }
            placeholder = sb.toString();
        } else {
            remainingLives--;
        }
        letterIndex.clear();

    }

    public boolean isWon() {
        return placeholder.equals(randomWord);
    }

    public boolean isLost() {
        return remainingLives == 0;
    }

    public String getPlaceholder() {

        return placeholder;
    }

    public int getLives() {
        return remainingLives;
    }

    public String getSecretWord(){
        return randomWord;
    }

}
