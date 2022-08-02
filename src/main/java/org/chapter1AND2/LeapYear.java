package org.chapter1AND2;

public class LeapYear {
    public boolean isYearLeapYear(int year) {
        if(year % 4 == 0 && year % 100 != 0)
            return true;
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            return true;
        return false;
    }
}
