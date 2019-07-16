package com.stackroute.pe1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Practice Exercise Question - 5
 * Class reads an unspecified number of integer arguments using Scanner Class
 * and adds them together.
 */
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (enter any character to stop reading): ");
        int number = 0;
        int sum = 0;
        while (true) {
            try {
                number = scanner.nextInt();
                sum += number;
                System.out.println("Sum: " + sum);
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("Please enter integers only");
                break;
            }
        }
        /*Close the scanner*/
        scanner.close();
    }
}
