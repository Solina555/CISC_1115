/* 9/17/2025
do for employee 2
We can copy/paste the code, delete the data types of the declarations,
and the code will work for 2 employees.
HOWEVER, a rule of thumb in coding is that anytime you copy/paste code
you should figure out a better way of doing things.

Use a LOOP.

maybe add in about taxes, show conditional operator, talk about a loop

Problem: a company with 2 employees wants us to write a program to calculate
salaries. Employees are paid by the hour and overtime.
 */
package Week_5;

import java.util.Scanner;

public class Payroll_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (count < 2) {
            System.out.println("Enter idnum, hours, and rate for employee:  ");
            System.out.println("idnum should be between 1000 and 9999");
            int idnum = sc.nextInt();
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
        } // end while
        // do again for employee 2
        /**
         * System.out.println("Enter idnum, hours, and rate for next employee:
         * "); System.out.println("idnum should be between 1000 and 9999");
         * idnum=sc.nextInt(); hours=sc.nextDouble(); rate=sc.nextDouble();
         * base=rate*hours; // overtime if (hours>40) { salary = (hours-40) *
         * (.5 * rate) + base; } else { salary = base; }
         * System.out.printf("salary: %4.2f of employee %d\n", salary, idnum);
         */
    }
}
