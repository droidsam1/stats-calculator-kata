package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsCalculatorTest {

    @Test
    public void shouldReturnAnObjectWithStats() {
        Assertions.assertNotNull(StatsCalculator.calculate(new int[]{1, 2, 3}));
    }
}
