package com.hamzahjamad.practice.chapter_16_generic_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(7));
        list.add(new Integer(5));
        list.add(new Integer(16));

        System.out.printf("Unsorted array elements: %n%s%n", list);

        Collections.sort(list, new DumbIntegerComparator());

        System.out.printf("Sorted array elements: %n%s%n", list);
    }
}
