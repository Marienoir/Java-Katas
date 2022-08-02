package org.chapter3AND4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsCalculatorTest {
    @Test
    void whatIsMinimumValue(){
        StatsCalculator statsCalculator = new StatsCalculator();
        int minVal = statsCalculator.getMinimumValue();
        assertEquals(-2, minVal);
    }
    @Test
    void whatIsMaximumValue(){
        StatsCalculator statsCalculator = new StatsCalculator();
        int maxVal = statsCalculator.getMaximumValue();
        assertEquals(92, maxVal);
    }
    @Test
    void whatIsTotalNumberInSequence(){
        StatsCalculator statsCalculator = new StatsCalculator();
        int totalNum = statsCalculator.getTotalNumber();
        assertEquals(6, totalNum);
    }
    @Test
    void whatIsAverageValueInSequence(){
        StatsCalculator statsCalculator = new StatsCalculator();
        double avg = statsCalculator.getAverageNumber();
        assertEquals(21.833333, avg);
    }
}
