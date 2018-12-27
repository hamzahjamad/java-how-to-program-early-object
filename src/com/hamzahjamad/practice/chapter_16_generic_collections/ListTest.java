package com.hamzahjamad.practice.chapter_16_generic_collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args)
    {
        String[] colors1 = { "black", "yellow", "green", "blue", "violet", "silver" };
        List<String> list1 = new LinkedList<>();

        for (String color: colors1) {
            list1.add(color);
        }

        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
        List<String> list2 = new LinkedList<>();

        for (String color: colors2) {
            list2.add(color);
        }

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUpperCaseStrings(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6");
        removeItems(list1, 4, 6);
        printList(list1);
        printReversedList(list1);
    }

    public static void printList(List<String> list)
    {
        System.out.printf("%nlist:%n");

        for (String color: list) {
            System.out.printf("%s ", color);
        }

        System.out.println();
    }

    public static void convertToUpperCaseStrings(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    public static void removeItems(List<String> list, int start, int end)
    {
        list.subList(start, end).clear();
    }

    public static void printReversedList(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }
    }
}
