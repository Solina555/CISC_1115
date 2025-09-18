/* 9/15/2025
   We want to use the 'if' statement to check whether a number is within
a certain range.

and for input validation

LAB: Write a program that reads in 3 integers and prints the smallest number
 of the 3. 
 */
package Week_4;

import java.util.Scanner;

public class Ranges {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the current degrees? ");
        double degrees = sc.nextDouble();

        if (degrees > 110 || degrees < -10) {
            System.out.println("something is wrong with your temperature value.");
        }
        int grade;
        System.out.println("What is the next grade? ");
        grade=sc.nextInt();
        if (grade<0 || grade>100) {
            System.out.println("that is an invalid grade.");
            System.out.println("Enter another value for grade: ");
            grade=sc.nextInt();
        }
        if (!(grade>=0 && grade<=100)) {
            System.out.println("data is invalid.");
        }
        // if (0<=grade<=100) INVALID
        boolean valid=false;
        valid=grade>=0 && grade<=100;
        if (!valid) {
            System.out.println("not valid");
        }
        if (valid) {
            System.out.println("yes valid");
        }
        if (grade>=0 && grade<=100) {
            System.out.println("data is valid.");
        }
        if (degrees > 70) {
            System.out.println("Turn on the a/c.");
        } else {
            System.out.println("Turn off the a/c");
        }
        System.out.println("Good Night.");

        if (degrees < 68) {
            System.out.println("Turn on the heat.");
        }

        // this is the "extra" part of the lab
        int day = 5;
        if (day == 1) {
            System.out.println("Sunday");
        } else if (day == 2) {
            System.out.println("Monday");
        } else if (day == 3) {
            System.out.println("Tuesday");
        } else if(day == 4) {
            System.out.println("Wednesday");
        } else if(day ==5) {
            System.out.println("Thursday");   //etc
        } else {
            System.out.println("that is not a valid day.");
        }

        char letter = 'a';
        switch (letter) {
            case 'A':
        }
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("That is not a valid day.");
        }
        return;
    }
}
