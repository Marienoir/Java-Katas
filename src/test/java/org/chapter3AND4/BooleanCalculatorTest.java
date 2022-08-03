package org.chapter3AND4;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BooleanCalculatorTest {
    @Test
    void singleValueTrue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void singleValueFalse() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void notTrueValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("NOT TRUE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void notFalseValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("NOT FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void trueAndFalseValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE AND FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void trueAndTrueValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE AND TRUE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void trueOrFalseValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE OR FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void falseOrFalseValue() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("FALSE OR FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void andOrValues() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE OR TRUE OR TRUE AND FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void andOrNotValues() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("TRUE OR FALSE AND NOT FALSE");
        assertEquals(true, expectedBoolean);
    }

    @Test
    void andOrParenthesisValues() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("(TRUE OR TRUE OR TRUE) AND FALSE");
        assertEquals(false, expectedBoolean);
    }

    @Test
    void andOrNotParenthesisValues() {
        BooleanCalculator booleanCalculator = new BooleanCalculator();
        boolean expectedBoolean = booleanCalculator.getBoolean("NOT (TRUE AND TRUE)");
        assertEquals(false, expectedBoolean);
    }
}
