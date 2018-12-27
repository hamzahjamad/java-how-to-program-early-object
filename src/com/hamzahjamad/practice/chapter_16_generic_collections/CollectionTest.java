package com.hamzahjamad.practice.chapter_16_generic_collections;

import java.util.*;

public class CollectionTest {

    public static void main(String[] args)
    {
        String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
        List<String> list = new ArrayList<>();

        for (String color: colors) {
            list.add(color);
        }

        String[] removeColors = { "RED", "WHITE", "BLUE" };
        List<String> removeList = new ArrayList<>();

        for (String color: removeColors) {
            removeList.add(color);
        }

        System.out.println("ArrayList: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color: list) {
            System.out.printf("%s ", color);
        }
    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2)
    {
       Iterator<String> iterator = collection1.iterator();

       while (iterator.hasNext()) {
           if (collection2.contains(iterator.next())) {
               iterator.remove();
           }
       }
    }

}
