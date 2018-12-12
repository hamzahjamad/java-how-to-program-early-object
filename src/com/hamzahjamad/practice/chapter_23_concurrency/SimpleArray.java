package com.hamzahjamad.practice.chapter_23_concurrency;

import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
    private static final SecureRandom generator = new SecureRandom();
    private final int[] array;
    private int writeIndex = 0;

    public SimpleArray(int size)
    {
        array = new int[size];
    }

    public void add(int value)
    {
        int position = writeIndex;

        try {
            Thread.sleep(generator.nextInt(500));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        array[position] = value;
        System.out.printf(
                "%s wrote %2d to element %d.%n",
                Thread.currentThread().getName(),
                value,
                position
        );

        ++writeIndex;
        System.out.printf("Next write index: %d%n", writeIndex);
    }

    @Override
    public String toString()
    {
        return Arrays.toString(array);
    }
}
