package com.hamzahjamad.practice.chapter_16_generic_collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort2 {
    public static void main(String[] args)
    {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted array elements: %s%n", list);
    }
}
