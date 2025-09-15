package Week_4;

import java.util.Scanner;

public class Lab_9_15_25 {
    // Lab: Write a program that reads in 3 integers and prints the smallest number of the 3.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int smallestNumber = Math.min(num1, Math.min(num2, num3));
        System.out.println("Smallest Number: " + smallestNumber);
    }
}
