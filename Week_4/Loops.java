/* while(condition) {
        // do all of this
   }
a condition is a boolean expression
 */
package Week_4;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // this while loop counts down, modifying num
        int num = 5;
        while (num > 0) {
            System.out.println("Hello World! num=" + num);
            // you must modify num in the loop so that it should eventually end
            num--;
        }
        num = 1;
        // this while loop counts up from 1-5
        while (num <= 5) {
            System.out.println("Hello World! num=" + num);
            // you must modify num in the loop so that it should eventually end
            num++;
        }
        // here we use a variable as upper limit. counter is the variable that
        // counts from 1 to upperLimit
        int upperLimit = 10;
        int counter = 1;
        while (counter <= upperLimit) {
            System.out.println(counter);
            counter++;
        }
        // in this example, we ask the user for the value of upperLimit
        // the loop is identical to the previous example
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to count up to?");
        upperLimit = sc.nextInt();
        counter = 1;
        while (counter <= upperLimit) {
            System.out.println(counter);
            counter++;
        }
        // we can allow the user to determine whether the loop should continue
        int cont = 1;
        System.out.println("Do you want to start? (0 No, 1 Yes) ");
        cont = sc.nextInt();
        while (cont == 1) {
            // process data here
            System.out.println("Do you want to continue: (0 No, 1 Yes) ");
            cont = sc.nextInt();
        }
        // I want a while loop to read in a bunch of numbers
        num = 0;
        while (num != -1) {
            System.out.println("Enter next number (-1 to end): ");
            num = sc.nextInt();
            System.out.println("num: " + num);
        }
    }
}
