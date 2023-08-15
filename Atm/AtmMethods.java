package Atm;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmMethods extends UserBalance{

    Scanner kb = new Scanner(System.in);

    //WithdrwalMethod Start Here
    public void WithDrawal(){
        System.out.println("Enter the amount :");
        double wdrl = kb.nextDouble();
        if(wdrl < getUserbalance()){
            System.out.println("Please Collect the Cash !");
            System.out.println("Do you want to check the Balance (Y/N)");
            char a = kb.next().charAt(0);
            char b = 'Y';
            if(a == b){
                total = total - wdrl;
                System.out.println("Account Balance is "+"₹"+total);
            }
            else{
                System.out.println("Thank You Visit Again!!");
            }
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }

    //DepositMethod Start Here
    public void Deposit(){
        System.out.println("Enter the amount :");
        double amnt = kb.nextDouble();
        total = total + amnt;
        System.out.println("Do you want to check the Balance (Y/N)");
        char a = kb.next().charAt(0);
        char b = 'Y';

        if (a == b){
            System.out.println("Account Balance is "+"₹"+total);
        }
        else{
            System.out.println("Thank You Visit Again!!");
        }
    }

    //CheckBalanceMethod Start Here
    public void CheckBalance(){
        System.out.println("Your Balance is"+"₹" + total);
    }
}
