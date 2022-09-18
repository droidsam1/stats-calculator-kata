package com.droidsam.app;

import java.util.Arrays;

class Stats {

    private final IntegerSequence inputData;

    public Stats(IntegerSequence inputData) {
        this.inputData = inputData;
    }

    public int getMinimumValue() {
        return Arrays.stream(inputData.getValues()).min().orElse(0);
    }

    public int getMaximumValue() {
        return Arrays.stream(inputData.getValues()).max().orElse(0);
    }

    public int getNumberOfElements() {
        return 1;
    }
}
