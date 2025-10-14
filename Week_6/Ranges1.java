/* 9/15/2025
   We want to use the 'if' statement to check whether a number is within
a certain range.

and for input validation

LAB: Write a program that reads in 3 integers and prints the smallest number
 of the 3. 
 */
package Week_6;

import java.util.Scanner;

public class Ranges1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int grade;
        System.out.println("What is the next grade (-1 to exit)? ");
        grade = sc.nextInt();
        while (grade != -1) {
            // using a while loop to validate the input
            while (grade < 0 || grade > 100) {
                System.out.println("that is an invalid grade.");
                System.out.println("Enter another value for grade: ");
                grade = sc.nextInt();
            } // end the inner while loop
            // when you arrive here you have a valid grade
            // process it and then read in next one.
            System.out.println("processing grade " + grade + " ...");
            System.out.println("What is the next grade? (-1 to exit) ");
            grade = sc.nextInt();
        } // end the outer while loop
        
        return;
    }
}
