package com.droidsam.app;

public class StatsCalculator {
    public static Stats calculate(int[] ints) {
        return new Stats(new IntegerSequence(ints));
    }
}