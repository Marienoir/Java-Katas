package org.chapter3AND4;

public class RomanNumeral {
    public String ofValue(int numeral) {
        String[] numerals = {"I", "II", "III"};
        if (numeral < 4)
            return (numerals[numeral-1]);
        if (numeral == 4)
            return ofValue(1)+ ofValue(5);
        if (numeral == 5)
            return getNumeralBreakpoint(numeral);
        if (numeral > 5 && numeral < 9)
            return getNumeralBreakpoint(numeral) + ofValue(numeral - 5);
        if (numeral == 9)
            return numerals[0]+ getNumeralBreakpoint(numeral);
        if (numeral == 10)
            return getNumeralBreakpoint(numeral);
        if (numeral > 10 && numeral < 14)
            return getNumeralBreakpoint(numeral) + ofValue(numeral- 10);
        if (numeral == 14)
            return getNumeralBreakpoint(numeral) + ofValue(4);
        if (numeral == 15)
            return getNumeralBreakpoint(numeral);
        if (numeral > 15 && numeral < 19)
            return getNumeralBreakpoint(numeral) + ofValue(numeral - 15);
        if (numeral == 19)
            return ofValue(10)+ ofValue(9);
        if (numeral == 20)
            return ofValue(10) + ofValue(10);
        if (numeral >= 20)
            return getNumeralBreakpoint(numeral);
        return null;
    }
    public static String getNumeralBreakpoint(int numeral){
        if (numeral > 4 && numeral < 9) {
            return "V";
        }
        if (numeral > 8 && numeral <= 14) {
            return "X";
        }
        if (numeral > 14 && numeral < 20) {
            return "XV";
        }
        if (numeral >= 20) {
            return "XX";
        }
        return null;
    }
}
