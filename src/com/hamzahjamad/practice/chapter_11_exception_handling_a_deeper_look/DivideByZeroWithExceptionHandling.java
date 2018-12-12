package com.hamzahjamad.practice.chapter_11_exception_handling_a_deeper_look;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    public static int quotient(int numerator, int denominator) throws ArithmeticException
    {
        return numerator / denominator;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try
            {

                System.out.print("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);

                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException e) {
                System.err.printf("%nException: %s%n", e);
                scanner.nextLine();
                System.out.printf("You must enter integers. Please try again.");
            } catch (ArithmeticException e) {
                System.err.printf("%nException: %s%n", e);
                System.out.printf("Zero is an invalid denominator. Please try again. %n%n");
            }
        } while (continueLoop);


    }

}
