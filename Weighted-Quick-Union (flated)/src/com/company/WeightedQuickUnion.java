package com.company;

public class WeightedQuickUnion {
    private int[] arrayOfItems;
    private int[] numbersOfItemsInTree;

    public WeightedQuickUnion(int numberOfElements) {
        initArrays(numberOfElements);
    }

    public boolean connect(int number1, int number2) {

        int rootOfNumber1 = root(number1);
        int rootOfNumber2 = root(number2);

        if(rootOfNumber1 == rootOfNumber2) {
            return false;
        }

        if(this.numbersOfItemsInTree[number1] < this.numbersOfItemsInTree[number2]) {
            this.arrayOfItems[rootOfNumber1] = rootOfNumber2;
            this.numbersOfItemsInTree[rootOfNumber2] += this.numbersOfItemsInTree[rootOfNumber1];
        } else {
            this.arrayOfItems[rootOfNumber2] = rootOfNumber1;
            this.numbersOfItemsInTree[rootOfNumber1] += this.numbersOfItemsInTree[rootOfNumber2];
        }
        return true;

    }

    public boolean isConnected(int number1, int number2) {
        return root(number1) == root(number2);
    }

    private int root(int i) {
        while (i != this.arrayOfItems[i]) {
            this.arrayOfItems[i] = this.arrayOfItems[this.arrayOfItems[i]]; // This line make it flat
            i = this.arrayOfItems[i];
        }
        return i;
    }

    private void initArrays(int numberOfElements) {
        this.arrayOfItems = new int[numberOfElements];
        this.numbersOfItemsInTree = new int[numberOfElements];
        for (int i = 0; i < this.arrayOfItems.length; i++)
        {
            this.arrayOfItems[i] = i;
            this.numbersOfItemsInTree[i] = 1;
        }
    }
}
