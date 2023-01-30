//Manuel Moya Valdivia 260510582
import java.util.Scanner;

public class CoinMachine {

    public static void main(String[] args) {

        // Below I import the Scanner type
        Scanner input = new Scanner(System.in);

        //Requesting input from user for cash
        System.out.print("Please insert your cash:");
        int cash = input.nextInt();

        //Requesting input from user for price
        System.out.print("Please enter the cost:");
        int price = input.nextInt();

        //Formula to obtain the total amount of change in integer form
        int change = cash - price;

        //Find number of toonies and defining remainingChange. The value of a toonie in integer form is 200
        int toonies = change/200;
        int remainingChange = change % 200;

        //Find number for loonies and update value for remainingChange. The value of a loonie in integer form is 100
        int loonies = remainingChange/100;
        remainingChange = remainingChange % 100;

        //Find the number of quarters and update value for remainingChange. The value of a quarter in integer form is 25
        int quarters = remainingChange/25;
        remainingChange = remainingChange % 25;

        //Find the number of dimes and update the value for remainingChange. The value of a dime in integer form is 10
        int dimes = remainingChange/10;
        remainingChange = remainingChange % 10;

        //Finally, from the remaining change, find the number of nickels. The value for a nickle in int form is 5
        int nickels = remainingChange/5;
        //Since it's assumed that all values are divisible by 5, there should not be any remainders

        //Print Out
        System.out.println("Amount received: " + cash);
        System.out.println("Cost of the item: " + price);
        System.out.println("Required change: " + change);
        System.out.println("Change:");
        System.out.println("toonies x " + toonies);
        System.out.println("loonie x " + loonies);
        System.out.println("quarter x " + quarters);
        System.out.println("dime x " + dimes);
        System.out.println("nickel x " + nickels);
    }
}