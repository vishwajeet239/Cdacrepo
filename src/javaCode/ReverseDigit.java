package javaCode;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        // Initialize a number to some integer value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the digits
        int reversedNumber = reverseDigits(number);

        // Display the results
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    private static int reverseDigits(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
