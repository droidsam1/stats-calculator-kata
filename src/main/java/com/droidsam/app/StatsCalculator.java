package com.droidsam.app;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class StatsCalculator {
    public static Stats calculate(int[] ints) {
        return new Stats(ints);
    }
}