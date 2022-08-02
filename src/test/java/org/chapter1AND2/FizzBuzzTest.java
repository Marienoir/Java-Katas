package org.chapter1AND2;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void NotDivisibleBy1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(1);
        assertEquals("1",value);
    }
    @Test
    public void NotDivisibleBy2() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(2);
        assertEquals("2",value);
    }
    @Test
    public void NotDivisibleBy4() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(4);
        assertEquals("4",value);
    }
    @Test
    public void ThreeDivisibleBy3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(3);
        assertEquals("fizz",value);
    }
    @Test
    public void SixDivisibleBy3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(6);
        assertEquals("fizz",value);
    }
    @Test
    public void NineDivisibleBy3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(9);
        assertEquals("fizz",value);
    }
    @Test
    public void TwelveDivisibleBy3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(12);
        assertEquals("fizz",value);
    }
    @Test
    public void FiveDivisibleBy5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(5);
        assertEquals("buzz",value);
    }
    @Test
    public void TenDivisibleBy5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(10);
        assertEquals("buzz",value);
    }
    @Test
    public void FifteenDivisibleBy3And5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(15);
        assertEquals("FizzBuzz",value);
    }
    @Test
    public void FortyFiveDivisibleBy3And5() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(45);
        assertEquals("FizzBuzz",value);
    }
    @Test
    public void MultiplesOf7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(7);
        assertEquals("Whizz",value);
    }
    @Test
    public void MultiplesOf11() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(11);
        assertEquals("Bang",value);
    }
    @Test
    public void MultiplesOf3And7() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(21);
        assertEquals("FizzWhizz",value);
    }
    @Test
    public void MultiplesOf5And11() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        String value = fizzbuzz.getFizzBuzz(55);
        assertEquals("BuzzBang",value);
    }
}
