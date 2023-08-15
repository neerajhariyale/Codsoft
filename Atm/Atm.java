package Atm;

import java.util.Scanner;

public class Atm  {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("\n**********Welcome to MyBank ATM**********");
        System.out.println("\nPlease Choose the Option -");
        System.out.println("1.Withdraw \n2.Deposit \n3.Check Balance ");
        int input = kb.nextInt();

        AtmMethods atm = new AtmMethods();
        switch (input){
            case 1:
                atm.WithDrawal();
                break;
            case 2:
                atm.Deposit();
                break;
            case 3:
                atm.CheckBalance();
                break;
        }
    }
}
