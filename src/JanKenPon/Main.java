package JanKenPon;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; //Java will refresh the computers attack each run of the code

public class Main {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        JanKenPonUI ui = new JanKenPonUI();
        int userChoice, pcChoice, userScore = 0, pcScore = 0;
        boolean endGame = false;
        String[] options = { "ROCK", "PAPER", "SCISSORS" };

        ui.printLogo();

        System.out.println("[Type 9 to end the game]\n");
        
        while (!endGame) {
            System.out.printf(
                    "\nPlayer: %d x Computer: %d\n",
                    userScore, pcScore);

            System.out.print("Type 0 for ROCK, 1 for PAPER and 2 for SCISSORS: ");
            userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2 && userChoice != 9) {
                System.out.println("Invalid input. Try again.");
                return;
            } else if (userChoice == 9) {
                System.out.printf("\nExiting...");
                endGame = true;
            }

            System.out.println("You chose " + options[userChoice]);
            ui.printAttack(userChoice);

            pcChoice = ThreadLocalRandom.current().nextInt(3);
            System.out.println("The computer chose chose " + options[pcChoice]);
            ui.printAttack(pcChoice);

            if (userChoice == pcChoice) {
                System.out.println("It's a draw!\n");
            } else if ((userChoice == 0 && pcChoice == 2) ||
                    (userChoice == 1 && pcChoice == 0) ||
                    (userChoice == 2 && pcChoice == 1)) {
                userScore++;
                System.out.printf("You won! %s beats %s\n", options[userChoice], options[pcChoice]);
            } else {
                pcScore++;
                System.out.printf("The computer won! %s beats %s\n", options[userChoice], options[pcChoice]);
            }

            if (userScore == 10 || pcScore == 10) {
                System.out.printf("\nEnd of game!");
                endGame = true;
            }
        }

        scanner.close();

    }
}
