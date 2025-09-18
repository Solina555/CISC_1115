/* 9/10/2025
   
 */
package Week_4;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the current degrees? ");
        double degrees = sc.nextDouble();

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
