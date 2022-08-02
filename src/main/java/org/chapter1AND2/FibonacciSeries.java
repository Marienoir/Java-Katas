package org.chapter1AND2;

public class FibonacciSeries {
    public int getNumberAtPosition(int num) {
        if(num == 1 || num == 2)
        return 1;
        return getNumberAtPosition(num - 1) + getNumberAtPosition(num - 2);
    }
}
