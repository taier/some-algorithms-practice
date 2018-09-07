package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfElements = UserInputModule.askForSingleInteger();
        WeightedQuickUnion weightedQuickUnion = new WeightedQuickUnion(numberOfElements);

        boolean userWantToContinue = true;

        while (userWantToContinue) {
            int[] itemsToConnect = UserInputModule.askForTwoIntegers();
            weightedQuickUnion.connect(itemsToConnect[0], itemsToConnect[1]);
            userWantToContinue = UserInputModule.askIfUserWantToContinue();
        }
    }
}
