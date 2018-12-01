package com.hamzahjamad.practice.chapter_14_strings_characters_and_regular_expressions;

import java.util.Scanner;

public class TokenTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence and press Enter");
        String sentence = scanner.nextLine();

        String[] tokens = sentence.split(" ");
        System.out.printf("Number of elements: %d%n", tokens.length);
        System.out.println("The tokens are:");

        for (String token: tokens)
            System.out.println(token);
    }

}
