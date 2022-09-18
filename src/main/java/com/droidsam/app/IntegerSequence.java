package com.droidsam.app;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class IntegerSequence {

    private final int[] sequence;

    public IntegerSequence(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new InvalidParameterException("Sequences cannot be instantiated from null or empty");
        }
        this.sequence = Arrays.stream(numbers).toArray();
    }

    public int[] getValues() {
        return this.sequence;
    }
}
