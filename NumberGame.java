package taskjavacodsoft;

import java.util.Scanner;
//import java.util.Random;

class NumberGame{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        int userinput;
        int attempt = 5;
        System.out.println();
        System.out.println("~~~GUESS THE NUMBER GAME~~~");
        System.out.println("#Note :Enter the from 0-100");
        System.out.println("You Have 5 attempts for the correct number");
        System.out.println("------------LET'S THE GAME BEGIN --------------------");

        while(attempt > 0) {
            System.out.print("Guess the number :");
            userinput = kb.nextInt();
            if(userinput == random){
                System.out.println("Congratulation !! You Guess the correct number .");
                break;
            }
            else if (userinput>random) {
                System.out.println("ohh... too HIGH number");
            }
            else if (userinput<random) {
                System.out.println("ohh... too LOW number");
            }
            attempt--;
            if (attempt == 0){
                System.out.println();
                System.out.println("You Lose !!!");
                System.out.println("You Have Tried Maximum Attempt !!");
                System.out.println("Correct Number is :"+random);
            }
        }
    }
}
