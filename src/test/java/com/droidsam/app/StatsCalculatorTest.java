package com.droidsam.app;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class StatsCalculatorTest {

    public static final int[] UNSORTED_POSITIVE_ARRAY = {22, 7, 8, 10, 20, 3};
    public static final int[] ARRAY_WITH_NEGATIVES = {2, 0, -1, -2};
    public static final int[] ONLY_ONE_ELEMENT_ARRAY = {22};
    public static final int[] SORTED_ARRAY = {1, 2, 3};

    @Test
    public void shouldReturnAnObjectWithStats() {
        assertNotNull(StatsCalculator.calculate(new int[]{1, 2, 3}));
    }

    @Test()
    public void shouldThrowExceptionIfInputArrayIsNull() {
        assertThrows(InvalidParameterException.class, () -> StatsCalculator.calculate(null));
    }

    @Test()
    public void shouldThrowExceptionIfInputArrayIsEmpty() {
        assertThrows(InvalidParameterException.class, () -> StatsCalculator.calculate(new int[]{}));
    }

    @Test
    public void shouldReturnTheMinimumValue() {

        Stats stats = StatsCalculator.calculate(SORTED_ARRAY);

        assertEquals(1, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsNotSorted() {

        Stats stats = StatsCalculator.calculate(UNSORTED_POSITIVE_ARRAY);

        assertEquals(3, stats.getMinimumValue());
    }


    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsOnlyOneElement() {

        Stats stats = StatsCalculator.calculate(ONLY_ONE_ELEMENT_ARRAY);

        assertEquals(22, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMinimumValueWhenArrayContainsNegativeNumbers() {

        Stats stats = StatsCalculator.calculate(ARRAY_WITH_NEGATIVES);

        assertEquals(-2, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayIsOnlyOneElement(){
        Stats stats = StatsCalculator.calculate(ONLY_ONE_ELEMENT_ARRAY);

        assertEquals(22, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayIsNotSorted() {

        Stats stats = StatsCalculator.calculate(UNSORTED_POSITIVE_ARRAY);

        assertEquals(22, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayContainsNegativeNumbers() {

        Stats stats = StatsCalculator.calculate(ARRAY_WITH_NEGATIVES);

        assertEquals(2, stats.getMaximumValue());
    }

}
