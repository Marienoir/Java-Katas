package org.chapter3AND4;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorTest {
    @Test
    void FactorizeNumber1() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(1);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber2() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        actualFactor.push(2);
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(2);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber3() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        actualFactor.push(3);
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(3);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber4() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        actualFactor.push(2);
        actualFactor.push(2);
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(4);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber5() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(5);
        actualFactor.push(5);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber6() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        actualFactor.push(2);
        actualFactor.push(3);
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(6);
        assertEquals(actualFactor, expectedFactors);
    }
    @Test
    void FactorizeNumber35() {
        PrimeFactor primeFactor = new PrimeFactor();
        Stack<Integer> actualFactor = new Stack<>();
        actualFactor.push(5);
        actualFactor.push(7);
        Stack<Integer> expectedFactors = primeFactor.getPrimeFactor(35);
        assertEquals(actualFactor, expectedFactors);
    }
}
