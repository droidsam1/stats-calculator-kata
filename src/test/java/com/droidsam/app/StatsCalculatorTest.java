package com.droidsam.app;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

public class StatsCalculatorTest {

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

        Stats stats = StatsCalculator.calculate(SequenceFixture.getSortedArray());

        assertEquals(1, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsNotSorted() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getUnsortedPositiveArray());

        assertEquals(3, stats.getMinimumValue());
    }


    @Test
    public void shouldReturnTheMinimumValueWhenArrayIsOnlyOneElement() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getOnlyOneElementArray());

        assertEquals(22, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMinimumValueWhenArrayContainsNegativeNumbers() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getArrayWithNegatives());

        assertEquals(-2, stats.getMinimumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayIsOnlyOneElement() {
        Stats stats = StatsCalculator.calculate(SequenceFixture.getOnlyOneElementArray());

        assertEquals(22, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayIsNotSorted() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getUnsortedPositiveArray());

        assertEquals(22, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheMaximumValueWhenArrayContainsNegativeNumbers() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getArrayWithNegatives());

        assertEquals(2, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheMaximumValue() {

        Stats stats = StatsCalculator.calculate(SequenceFixture.getSortedArray());

        assertEquals(3, stats.getMaximumValue());
    }

    @Test
    public void shouldReturnTheNumberOfElementsForOnlyOneElementArray(){
        Stats stats = StatsCalculator.calculate(SequenceFixture.getOnlyOneElementArray());

        assertEquals(1, stats.getNumberOfElements());
    }

}
