
import java.util.Scanner;
//input method for user
public class KhanCalculatorTip {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        //initialize user input

        System.out.print("Bill: ");
        double billAmount= input.nextDouble();
        System.out.print("What percentage of tip do you want to give? ");
        double tipPercentage= input.nextDouble();
        System.out.print("How many people are involved? ");
        int amountPeople= input.nextInt();
        //user interaction //beginning of code

        System.out.println("-----------------");
        //design of bill

        double totalTipAmount= billAmount * (tipPercentage/100);
        //calculations for total tip amount

        double totalBillAmountWithTip= billAmount * (1+tipPercentage/100);
        //calculations for total bill amount with tip

        double tipPerPerson= totalTipAmount/amountPeople;
        //calculations for tip per person

        double totalPerPerson= totalBillAmountWithTip/amountPeople;
        //calculations for total bill per person

        System.out.println("Total tip amount: " + totalTipAmount);
        System.out.println("Total bill amount with tip: " + totalBillAmountWithTip);
        System.out.println("Tip per person: " + tipPerPerson);
        System.out.println("Total bill per person: " + totalPerPerson);
        //info displayed about each calculation above to the user

        System.out.println();
        System.out.print("-----------------");
        //ending design of bill

    }
}
