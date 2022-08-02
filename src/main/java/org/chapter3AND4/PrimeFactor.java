package org.chapter3AND4;

import java.util.Stack;

public class PrimeFactor {
    public static Stack<Integer> getPrimeFactor(int number) {
        Stack<Integer> primeFactors = new Stack<>();
        int[] factor = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        for (int value: factor){
                while(number % value == 0){
                    primeFactors.push(value);
                    number /= value;
                }
            }
        System.out.println(primeFactors);
        return primeFactors;
    }
    public static void main(String[] args) {
        getPrimeFactor(810);
    }
}

