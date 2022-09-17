package com.droidsam.app;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class StatsCalculatorTest {

    @Test
    public void shouldReturnAnObjectWithStats() {
        assertNotNull(StatsCalculator.calculate(new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnTheMinimumValue() {

        Stats stats = StatsCalculator.calculate(new int[]{1, 2, 3});

        assertEquals(1, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsNotSorted() {

        Stats stats = StatsCalculator.calculate(new int[]{22, 7, 8, 10, 20, 3});

        assertEquals(3, stats.getMinimumValue());
    }


    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsOnlyOneElement() {

        Stats stats = StatsCalculator.calculate(new int[]{22});

        assertEquals(22, stats.getMinimumValue());
    }

    @Test()
    public void shouldThrowExceptionIfInputArrayIsNull() {
        assertThrows(InvalidParameterException.class, () -> StatsCalculator.calculate(null));
    }
}
