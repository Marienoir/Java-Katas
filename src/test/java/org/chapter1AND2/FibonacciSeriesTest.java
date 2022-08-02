package org.chapter1AND2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciSeriesTest {
    @Test
    void whatIsAtPosition1(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        int num = fibonacci.getNumberAtPosition(1);
        assertEquals(1, num);
    }
    @Test
    void whatIsAtPosition2(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        int num = fibonacci.getNumberAtPosition(2);
        assertEquals(1, num);
    }
    @Test
    void whatIsAtPosition3(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        int num = fibonacci.getNumberAtPosition(3);
        assertEquals(2, num);
    }
    @Test
    void whatIsAtPosition8(){
        FibonacciSeries fibonacci = new FibonacciSeries();
        int num = fibonacci.getNumberAtPosition(8);
        assertEquals(21, num);
    }
}
