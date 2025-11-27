import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.StringBuilder;

public class PasswordGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLetters, numSymbols, numNumbers;

        char[] letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        char[] symbols = { '!', '@', '#', '$', '%', '&', '*', '(', ')', '+', '?', '/', ';', ':', '|', '-', '=', ',',
                '.', '_', '{', '}', '~', '^', '`', '´', '<', '>' };

        ArrayList<Object> passwordList = new ArrayList<>();
        StringBuilder password = new StringBuilder();

        System.out.println("Wlcome to the Java Password Generator!");

        System.out.println("How many letters would you like in your password?");
        numLetters = scanner.nextInt();

        System.out.println("How many symbols would you like in your password?");
        numSymbols = scanner.nextInt();

        System.out.println("How many numbers would you like in your password?");
        numNumbers = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < numLetters; i++) {
            passwordList.add(letters[ThreadLocalRandom.current().nextInt(letters.length)]);
        }

        for (int i = 0; i < numSymbols; i++) {
            passwordList.add(symbols[ThreadLocalRandom.current().nextInt(symbols.length)]);
        }

        for (int i = 0; i < numNumbers; i++) {
            passwordList.add(ThreadLocalRandom.current().nextInt(10));
        }

        Collections.shuffle(passwordList);
        for (Object obj : passwordList) {
            password.append(obj);
        }

        System.out.println("Your password: " + password);

    }
}