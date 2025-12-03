package caesarCypher;

import java.util.LinkedList;

public class Alphabet {
    private LinkedList<Character> alphabet;

    private LinkedList<Character> buildAlphabet() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        LinkedList<Character> alphabet = new LinkedList<>();
        for (char c : letters.toCharArray()) {
            alphabet.add(c);

        }
        return alphabet;
    }

    public Alphabet() {
        alphabet = buildAlphabet();
    }

    public LinkedList<Character> getAlphabet() {
        return alphabet;
    }

}