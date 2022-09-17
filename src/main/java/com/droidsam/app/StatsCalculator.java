package com.droidsam.app;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class StatsCalculator {
    public static Stats calculate(int[] ints) {
        return new Stats(ints);
    }
}

class Stats {

    private final int[] inputData;

    public Stats(int[] inputData) {
        if (inputData == null) {
            throw new InvalidParameterException("Stats cannot be calculated for null");
        }
        this.inputData = inputData;
    }

    public int getMinimumValue() {
        return Arrays.stream(inputData).sorted().findFirst().orElse(0);
    }
}
