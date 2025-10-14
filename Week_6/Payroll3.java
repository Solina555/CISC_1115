/* 9/29/2025
We want to generalize this to work for any number of employees.
Bad pgming to write a loop with a literal such as 2.

We will try a few ways:
1. ask the user how many employees
2. stop processing when user enters a certain end of input sentinel (marker)
   USE A STRUCTURED READ LOOP
3. read data from a file (come  back to this)

maybe add in about taxes, show conditional operator, talk about a loop

LAB: goal: use a structured read loop.
read in any number of positive numbers
stop when user enters anything <=0
print how many numbers were read in.
*/
package Week_6;

import java.util.Scanner;

public class Payroll3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int idnum = 0;
        System.out.println("Enter idnum which should be between 1000 and 9998");
        System.out.println("Enter 9999 to exit.");
        idnum = sc.nextInt();
        while (idnum != 9999) {
            System.out.println("Processing employee #" + (count + 1));
            System.out.println("------------------------");
            System.out.println("Enter hours and rate for employee " + idnum + ":");
            // remove read idnum from here
            double hours = sc.nextDouble();
            double rate = sc.nextDouble();
            double base = rate * hours;
            double salary;
            // overtime
            if (hours > 40) {
                salary = (hours - 40) * (.5 * rate) + base;
            } else {
                salary = base;
            }
            System.out.printf("salary: %4.2f of employee %d\n", salary, idnum);
            count++;
            System.out.println("Enter idnum which should be between 1000 and 9998");
            System.out.println("Enter 9999 to exit.");
            idnum = sc.nextInt();
        } // end while
    }
}
