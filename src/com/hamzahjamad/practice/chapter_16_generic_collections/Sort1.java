package com.hamzahjamad.practice.chapter_16_generic_collections;

import java.util.*;

public class Sort1 {

    public static void main(String[] args)
    {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);
    }

}
