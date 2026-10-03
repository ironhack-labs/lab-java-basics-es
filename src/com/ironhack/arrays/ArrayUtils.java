package com.ironhack.arrays;

/**
 * Utility methods that solve the two array challenges of the lab (tasks 1 and 2).
 *
 * <p>Both algorithms are written with plain {@code for} loops and conditionals on purpose:
 * the lab asks for the logic to be developed by hand instead of relying on
 * {@code Arrays.sort} or the Stream API. Each array is traversed only once, so both
 * methods run in O(n) time and use O(1) extra memory.</p>
 *
 * <p>The class is final and has a private constructor because it only exposes static
 * helpers and is never meant to be instantiated or extended.</p>
 */
public final class ArrayUtils {

    /** Prevents instantiation of this utility class. */
    private ArrayUtils() {
        throw new AssertionError("ArrayUtils is a utility class and must not be instantiated");
    }

    /**
     * Task 1 - Returns the difference between the largest and the smallest value of an array.
     *
     * <p>The array is scanned once while keeping track of the minimum and the maximum seen
     * so far. The {@code else if} is safe because a value that is smaller than the current
     * minimum can never also be greater than the current maximum.</p>
     *
     * <p>Note on ranges: the result is returned as an {@code int}, which is enough for any
     * realistic input. Arrays mixing values close to {@link Integer#MIN_VALUE} and
     * {@link Integer#MAX_VALUE} would overflow the subtraction, so that extreme case is
     * explicitly out of scope for this exercise.</p>
     *
     * @param numbers the array to inspect; must contain at least one element
     * @return {@code max - min}, which is {@code 0} for a single element array
     * @throws IllegalArgumentException if {@code numbers} is {@code null} or empty
     */
    public static int differenceBetweenLargestAndSmallest(int[] numbers) {
        requireAtLeast(numbers, 1);

        int smallest = numbers[0];
        int largest = numbers[0];

        // Start at index 1: index 0 has already been used to seed both accumulators.
        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];

            if (current < smallest) {
                smallest = current;
            } else if (current > largest) {
                largest = current;
            }
        }

        return largest - smallest;
    }

    /**
     * Task 2 - Finds the smallest and the second smallest elements of an array and prints
     * them in the console.
     *
     * <p>"Second smallest" is interpreted as the second smallest <em>distinct</em> value, so
     * {@code [4, 1, 1, 9]} reports {@code 1} and {@code 4} rather than {@code 1} twice. When
     * every element is equal there is no second distinct value, and the method says so instead
     * of printing a misleading number.</p>
     *
     * @param numbers the array to inspect; must contain at least two elements
     * @throws IllegalArgumentException if {@code numbers} is {@code null} or has fewer than
     *                                  two elements
     */
    public static void printSmallestAndSecondSmallest(int[] numbers) {
        requireAtLeast(numbers, 2);

        int smallest = numbers[0];
        int secondSmallest = 0;
        // A boolean flag is used instead of a sentinel such as Integer.MAX_VALUE, which would
        // be indistinguishable from a legitimate element holding that same value.
        boolean secondSmallestFound = false;

        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];

            if (current < smallest) {
                // The previous minimum is now the best candidate for the second smallest.
                secondSmallest = smallest;
                secondSmallestFound = true;
                smallest = current;
            } else if (current > smallest && (!secondSmallestFound || current < secondSmallest)) {
                secondSmallest = current;
                secondSmallestFound = true;
            }
            // A value equal to the current smallest is a duplicate and is intentionally ignored.
        }

        System.out.println("Smallest element: " + smallest);
        if (secondSmallestFound) {
            System.out.println("Second smallest element: " + secondSmallest);
        } else {
            System.out.println("Second smallest element: none, every element equals " + smallest);
        }
    }

    /**
     * Guard clause shared by both challenges.
     *
     * @param numbers     the array to validate
     * @param minimumSize the minimum number of elements the algorithm needs
     * @throws IllegalArgumentException if the array is {@code null} or too short
     */
    private static void requireAtLeast(int[] numbers, int minimumSize) {
        if (numbers == null) {
            throw new IllegalArgumentException("The array must not be null");
        }
        if (numbers.length < minimumSize) {
            throw new IllegalArgumentException(
                    "The array must contain at least " + minimumSize + " element(s) but had " + numbers.length);
        }
    }
}
