package com.company;

public class QuickUnionModule {

    private int[] arrayOfItems;

    public QuickUnionModule(int numberOfElements) {
        initArray(numberOfElements);
    }

    public boolean connect(int number1, int number2) {

        if(isConnected(number1,number2)) {
            return false;
        }

        int rootOfNumber1 = root(number1);
        int rootOfNumber2 = root(number2);

        this.arrayOfItems[rootOfNumber1] = rootOfNumber2;

        return true;

    }

    public boolean isConnected(int number1, int number2) {
        return root(number1) == root(number2);
    }

    private int root(int i) {
        while (i != this.arrayOfItems[i]) {
            i = this.arrayOfItems[i];
        }
        return i;
    }

    private void initArray(int numberOfElements) {
        this.arrayOfItems = new int[numberOfElements];
        for (int i = 0; i < this.arrayOfItems.length; i++)
        {
            this.arrayOfItems[i] = i;
        }
    }
}
