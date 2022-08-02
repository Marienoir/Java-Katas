package org.chapter3AND4;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StatsCalculator {

    int[] numbers = {6, 9, 15, -2, 92, 11};
    public int getMinimumValue() {
        Arrays.sort(numbers);
        return numbers[0];
    }

    public int getMaximumValue() {
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }

    public int getTotalNumber() {
        return numbers.length;
    }

    public double getAverageNumber() {
        double sum = 0;
        for (double values : numbers) {
            sum += values;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        return Double.parseDouble(df.format(sum/numbers.length));
    }
}
