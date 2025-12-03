package caesarCypher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaesarCypherUI ui = new CaesarCypherUI();
        CaesarCypher cypher = new CaesarCypher();
        String message, option, outputMsg, endOption;
        boolean endScript = false;
        int shift;

        Scanner scanner = new Scanner(System.in);

        ui.printLogo();
        while (!endScript) {
            System.out.println("Type 'encode' to encrypt, type 'decode' to decrypt:");
            option = scanner.nextLine();
            if (!option.equalsIgnoreCase("encode") && !option.equalsIgnoreCase("decode")) {
                System.out.println("Invalid option. Use 'encode' or 'decode'.");
                continue;
            }

            System.out.println("Type your message:");
            message = scanner.nextLine();

            System.out.println("Type the shift number:");
            shift = scanner.nextInt();
            scanner.nextLine(); //consumes the remaining '\n' from nextInt()

            outputMsg = cypher.processMsg(option, message, shift);

            System.out.println("Here is the " + option + "d" + " " + "result: " + outputMsg);

            System.out.println("Type 'yes' if you want to go again. Otherwise type 'no'.");
            endOption = scanner.nextLine();

            if (endOption.equalsIgnoreCase("no")) {
                scanner.close();
                endScript = true;
            } else if (endOption.equalsIgnoreCase("yes")) {
                continue;
            } else {
                System.out.println("Invalid option. Use 'yes' or 'no'.");
            }

        }

        scanner.close();
        System.out.println("Program ended.");
    }
}
