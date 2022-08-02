package org.chapter3AND4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTest {
    @Test
    void OfValue1To5() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("I", romanNumeral.ofValue(1));
        assertEquals("II", romanNumeral.ofValue(2));
        assertEquals("III", romanNumeral.ofValue(3));
        assertEquals("IV", romanNumeral.ofValue(4));
        assertEquals("V", romanNumeral.ofValue(5));
    }
    @Test
    void OfValue6To10() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("VI", romanNumeral.ofValue(6));
        assertEquals("VII", romanNumeral.ofValue(7));
        assertEquals("VIII", romanNumeral.ofValue(8));
        assertEquals("IX", romanNumeral.ofValue(9));
        assertEquals("X", romanNumeral.ofValue(10));
    }
    @Test
    void OfValue11To15() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("XI", romanNumeral.ofValue(11));
        assertEquals("XII", romanNumeral.ofValue(12));
        assertEquals("XIII", romanNumeral.ofValue(13));
        assertEquals("XIV", romanNumeral.ofValue(14));
        assertEquals("XV", romanNumeral.ofValue(15));
    }
    @Test
    void OfValue16To20() {
        RomanNumeral romanNumeral = new RomanNumeral();
        assertEquals("XVI", romanNumeral.ofValue(16));
        assertEquals("XVII", romanNumeral.ofValue(17));
        assertEquals("XVIII", romanNumeral.ofValue(18));
        assertEquals("XIX", romanNumeral.ofValue(19));
        assertEquals("XX", romanNumeral.ofValue(20));
    }
}
