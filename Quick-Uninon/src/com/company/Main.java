package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfElements = UserInputModule.askForSingleInteger();
        QuickUnionModule quickUnionModule = new QuickUnionModule(numberOfElements);

        boolean userWantToContinue = true;

        while (userWantToContinue) {
            int[] itemsToConnect = UserInputModule.askForTwoIntegers();
            quickUnionModule.connect(itemsToConnect[0], itemsToConnect[1]);
            userWantToContinue = UserInputModule.askIfUserWantToContinue();
        }
    }
}
