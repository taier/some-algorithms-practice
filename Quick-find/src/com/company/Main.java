package com.company;

public class Main {

    public static void main(String[] args) {

        int numberOfElements = UserInputModule.askForSingleInteger();
        QuickFindModule quickFindModule = new QuickFindModule(numberOfElements);

        boolean userWantToContinue = true;

        while (userWantToContinue) {
            int[] itemsToConnect = UserInputModule.askForTwoIntegers();
            quickFindModule.connect(itemsToConnect[0], itemsToConnect[1]);
            userWantToContinue = UserInputModule.askIfUserWantToContinue();
        }

    }
}
