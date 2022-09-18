package com.droidsam.app;

import java.security.InvalidParameterException;
import java.util.Arrays;

class Stats {

    private final int[] inputData;

    public Stats(int[] inputData) {
        if (inputData == null || inputData.length == 0) {
            throw new InvalidParameterException("Stats cannot be calculated for null or empty arrays");
        }
        this.inputData = inputData;
    }

    public int getMinimumValue() {
        return Arrays.stream(inputData).min().orElse(0);
    }

    public int getMaximumValue() {
        return Arrays.stream(inputData).max().orElse(0);
    }
}
