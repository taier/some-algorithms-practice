package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfElements = UserInputModule.askForSingleInteger();
        QuickUninonModule quickUninonModule = new QuickUninonModule(numberOfElements);

        boolean userWantToContinue = true;

        while (userWantToContinue) {
            int[] itemsToConnect = UserInputModule.askForTwoIntegers();
            quickUninonModule.connect(itemsToConnect[0], itemsToConnect[1]);
            userWantToContinue = UserInputModule.askIfUserWantToContinue();
        }
    }
}
