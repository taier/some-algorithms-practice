package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputModule {

    public static int askForSingleInteger() {
        System.out.println("Please enter number of elements:");
        return getIntegerFromUser();
    }

    public static int[] askForTwoIntegers() {

        int[] returnArray = {-1,-1};

        System.out.println("Please enter the first number to merge with: ");
        returnArray[0] = getIntegerFromUser();
        System.out.println("Please enter the second number to merge with: ");
        returnArray[1] = getIntegerFromUser();

        return returnArray;
    }

    public static boolean askIfUserWantToContinue() {
        System.out.println("To continue enter '1', to abort any other integer");
        return getIntegerFromUser() == 1;
    }

    private static int getIntegerFromUser() {
        int returnValue = -1;
        boolean done = false;

        Scanner reader = new Scanner(System.in);
        while (!done) {
            System.out.print("Enter an integer: ");
            try {
                returnValue = reader.nextInt();
                if (returnValue > 0) {
                    done = true;
                }
                else {
                    // do something with the input
                    System.out.println("\tThe number entered is not correct, please try again");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("\tInvalid input type (must be an integer)");
                reader.nextLine();  // Clear invalid input from scanner buffer.
            }
        }

        return returnValue;
    }

}
