package com.droidsam.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsCalculatorShould {

    @Test
    public void returnAnObjectWithStats() {
        Assertions.assertNotNull(StatsCalculator.calculate(new int[]{1, 2, 3}));
    }
}
