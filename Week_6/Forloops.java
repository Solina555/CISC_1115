/* 9/29/2025
   
 */
package Week_6;

import java.util.Scanner;

public class Forloops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for (initialization;  condition;  update) { }
        int i = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("value of i: " + i);
        }
        // what is the value of i ?
        System.out.println("I fell out of the loop, i is: " + i);
        int upperLimit = 0;
        System.out.println("What is the upper limit for the loop: ");
        upperLimit = sc.nextInt();
        for (int j = 0; j < upperLimit; j++) {
            System.out.println("in second loop, j is: " + j);
        }

        System.out.println("Number    Square");
        for (int num = 2; num < 100; num+=2) {
            System.out.printf("%4d %10d\n", num, num * num);
        }
        
        System.out.println("Number    Square");
        for (int num = 5; num < 100; num+=5) {
            System.out.printf("%4d %10d\n", num, num * num);
        }
        System.out.println("What is the upper limit for the loop that prints squares: ");
        upperLimit = sc.nextInt();
        for(int num=1; num<=upperLimit; num++)  {
         System.out.printf("%4d %10d\n", num, num * num);
        }
        
    }
}
