import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double totalBill, finalBill, perPerson;
        int tipPercent, numPeople;

        System.out.println("=====TIP CALCULATOR=====");
        System.out.print("What was the total bill? $");
        totalBill = scanner.nextDouble();

        if (totalBill > 0){
            System.out.print("How much would you like to tip? Ranging from 10 to 15: %");
            tipPercent = scanner.nextInt();

            if (tipPercent >= 10 && tipPercent <= 15){
                System.out.print("How many people to split the bill? ");
                numPeople = scanner.nextInt();
                
                if (numPeople > 0){
                    finalBill = (((double)tipPercent/100.0) * totalBill) + totalBill;
                    perPerson = finalBill/numPeople;

                    System.out.printf("Each person should pay: $%.2f", perPerson);
                }else{
                    System.out.println("Huh? No one is willing to pay? Fine. You will all wash the dishes, or else Papito will beat your arse!");
                }
            }else{
                System.out.println("Wow. Either you are a cheapskate, or very generous.");
            }
        }else{
            System.out.println("So...You guys didnt buy anything? Get out of my bistro immediately!");
        }
        scanner.close();
        


    }
}