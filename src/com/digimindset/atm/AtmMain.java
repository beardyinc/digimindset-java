package com.digimindset.atm;

import java.util.Scanner;

/**
 * @author paullatzelsperger
 * @since 2019-03-01
 */
public class AtmMain {

    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {

        String storedPin = "1234";
        Scanner scanner = new Scanner(System.in);

        int balance = 4523;//initial balance on account in EURO

        System.out.print("Please enter 4-digit PIN: ");
        String inputPin = scanner.nextLine();
        int attempts = 0;

        while (!inputPin.equals(storedPin)) {
            attempts++;

            // make sure that only 3 attempts are allowed
            if (attempts >= MAX_ATTEMPTS) {
                System.err.println("You entered the wrong PIN 3 times! Card will be retracted!");
                System.exit(-1); //leave program with an error code
            } else {
                System.err.print("Your PIN was incorrect, try again You have " + (MAX_ATTEMPTS - attempts) + " attempt(s) left");
                inputPin = scanner.nextLine();
            }
        }

        //now the entered pin can assumed to be correct

        System.out.println("Welcome to the digi.mindset ATM machine, your balance is EUR " + balance);

        String input = "";
        while (!input.equals("q")) {

            System.out.print("Enter your choice ([w]ithdraw, [d]eposit, [p]rint, [q]uit)");
            input = scanner.nextLine();

            switch (input) {
                case "w":
                    System.out.print("Please enter the amount you wish to withdraw: ");
                    int withdrawalAmount = scanner.nextInt();
                    if (withdrawalAmount <= 0) {
                        System.err.println("Only positive inputs allowed!");
                    } else if (withdrawalAmount > balance) {
                        System.err.println("Your withdrawal exceeds your balance!");
                    } else {
                        // now we can actually withdraw something
                        balance -= withdrawalAmount;
                        System.out.println("Withdrawal successful, your balance is now: EUR" + balance );
                        System.out.println("Please take your money!");
                    }
                    break;
                case "d":
                    System.out.print("Please enter the amount you wish to deposit: ");
                    int depositAmount = scanner.nextInt();
                    if (depositAmount <= 0) {
                        System.err.println("Only positive amounts can be deposited!");
                    } else {
                        balance += depositAmount;
                        System.out.println("Amount was deposited successfully, your balance is now: EUR " + balance);
                    }
                    break;
                case "p":
                    System.out.println("Your account balance is " + balance + "€");
                    break;
                default:
                    System.err.println("Wrong input! Press enter to try again");
                    break;
            }

            scanner.nextLine(); // skip one newline character


        }

    }

}
