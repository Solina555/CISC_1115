/* 9/15/2025
next time: do for employee 2
maybe add in about taxes, show conditional operator, talk about a loop

Goal: Write a complete program to solve a real-world problem, using the
techniques that we have learned so far.
- variables 
- expressions (mathematical and boolean)
- input
- if stmt
- printing formatted

Problem: a company with 2 employees wants us to write a program to calculate
salaries. Employees are paid by the hour and overtime.

The program should:
read in rate and hours for an employee
calculate base salary
calculate overtime pay
print paycheck (base+overtime)

Software Development Process
1. Understand the problem (ask questions, for ex is overtime 1.5?)
2. Develop an algorithm
 - read in the data for one employee 
 - do some calculations 
      base=rate*hours
      overtime=1.5*rate for all hours > 40
 - print results
 - do the same thing for the second employee

3. Write pseudocode
   read in ID number
   read in hours worked
   read in rate per hour
   base=rate*hours
   if (hours>40)
      salary = (hours-40) * 1.5 + base 
   use printf

4. Write Java code 
5. Debug
6. Test 
*/
package Week_4;

import java.util.Scanner;

public class Payroll {
/* read in ID number
   read in hours worked
   read in rate per hour
   base=rate*hours
   if (hours>40)
      salary = (hours-40) * 1.5 + base 
   use printf */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter idnum, hours, and rate for employee:  ");
        System.out.println("idnum should be between 1000 and 9999");
        int idnum=sc.nextInt();
        double hours=sc.nextDouble();
        double rate=sc.nextDouble();
        double base=rate*hours;
        double salary;
        // overtime
        if (hours>40) {
            salary = (hours-40) * (.5 * rate) + base;
        } else {
            salary = base;
        }
        System.out.printf("salary: %4.2f of employee %d\n", salary, idnum);
    }
}
