package org.chapter1AND2;

public class FizzBuzz {
    public String getFizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz";
        if(num % 3 == 0 && num % 7 == 0)
            return "FizzWhizz";
        if(num % 5 == 0 && num % 11 == 0)
            return "BuzzBang";
        if(num % 3 == 0)
            return "fizz";
        if(num % 5 == 0)
            return "buzz";
        if(num % 7 == 0)
            return "Whizz";
        if(num % 11 == 0)
            return "Bang";
        return String.valueOf(num);
//    return num.toString();
    }
};