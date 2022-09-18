package com.droidsam.app;

public class SequenceFixture {

    private static final int[] UNSORTED_POSITIVE_ARRAY = {22, 7, 8, 10, 20, 3};
    private static final int[] ARRAY_WITH_NEGATIVES = {2, 0, -1, -2};
    private static final int[] ONLY_ONE_ELEMENT_ARRAY = {22};
    private static final int[] SORTED_ARRAY = {1, 2, 3};

    private static final int[] PROVIDED_EXAMPLE = {6, 9, 15, -2, 92, 11};


    public static int[] getUnsortedPositiveArray() {
        return UNSORTED_POSITIVE_ARRAY;
    }

    public static int[] getArrayWithNegatives() {
        return ARRAY_WITH_NEGATIVES;
    }

    public static int[] getOnlyOneElementArray() {
        return ONLY_ONE_ELEMENT_ARRAY;
    }

    public static int[] getSortedArray() {
        return SORTED_ARRAY;
    }

    public static int[] getProvidedExample() {
        return PROVIDED_EXAMPLE;
    }
}
