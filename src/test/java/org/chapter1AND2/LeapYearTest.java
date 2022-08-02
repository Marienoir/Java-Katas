package org.chapter1AND2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    @Test
    void Is2001LeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean value = leapYear.isYearLeapYear(2001);
        assertEquals(value, false);
    }
    @Test
    void Is1996LeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean value = leapYear.isYearLeapYear(1996);
        assertEquals(value, true);
    }
    @Test
    void Is1900LeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean value = leapYear.isYearLeapYear(1900);
        assertEquals(value, false);
    }
    @Test
    void Is2000LeapYear(){
        LeapYear leapYear = new LeapYear();
        boolean value = leapYear.isYearLeapYear(2000);
        assertEquals(value, true);
    }
}
