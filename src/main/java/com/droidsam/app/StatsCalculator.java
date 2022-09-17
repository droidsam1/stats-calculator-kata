package com.droidsam.app;

public class StatsCalculator {
    public static Stats calculate(int[] ints) {
        return new Stats(ints);
    }
}

class Stats {

    private final int[] inputData;

    public Stats(int[] inputData) {
        this.inputData = inputData;
    }

    public int getMinimunValue() {
        return 1;
    }
}
