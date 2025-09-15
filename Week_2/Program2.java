/* 9/3/2025
   second day of class in F25
   This is our very first java program
   This is called a comment and it is IGNORED by the compiler.

   We spoke about all data in a java program having a data type
   eg. String 
       integer 109

   We also saw how exact println is with formatting.
   escape sequences: \n  \t \"   begin with a backslash

   literal means an actual value (eg 109 is an integer literal, "Hello" is
   a string literal)
   a variable can take on different values
 */
package Week_2;

public class Program2 {

    public static void main(String[] args) {
        System.out.println("Hello\t \"World!\""); // print the string
        System.out.println(109); // print the number
        System.out.println("Total Charge: " + 109);
        System.out.println("Total\n Charges:");
        System.out.print("Grocery list: \n");
        System.out.print(" 1. apples \n 2. oranges \n 3. peaches\n");
        double charge;
        charge = 32.00;
        System.out.println("Charge: " + charge);
    }
}
