package com.company;

public class QuickFindModule {

    private int[] arrayOfItems;

    public QuickFindModule(int numberOfElements) {
        initArray(numberOfElements);
    }

    public boolean connect(int number1, int number2) {

        if(isConnected(number1,number2)) {
            return false; // already connected
        }

        int newIdentifier = this.arrayOfItems[number1];
        int oldIdentifier = this.arrayOfItems[number2];

        for (int i = 0; i < this.arrayOfItems.length; i++) {
            if(this.arrayOfItems[i] == oldIdentifier) {
                this.arrayOfItems[i] = newIdentifier;
            }
        }

        return true;
    }

    public boolean isConnected(int number1, int number2) {
        return this.arrayOfItems[number1] == this.arrayOfItems[number2];
    }

    private void initArray(int numberOfElements) {
        this.arrayOfItems = new int[numberOfElements];
        for (int i = 0; i < this.arrayOfItems.length; i++)
        {
            this.arrayOfItems[i] = i;
        }
    }
}
