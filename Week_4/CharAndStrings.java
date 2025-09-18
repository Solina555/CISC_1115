/* 9/10/2025
   Char and String data types (CHAPTER 2)
   char literal goes into single quotes
   String literal goes into double quotes

PDT - primitive data types  int,double,char,boolean
Classes - user defined data types  ex: String, Scanner
When you get a variable of a Class we call it an Object
key difference - you use the DOT operator on an Object and not on a var.
int num;   NEVER num.changeMe()
Scanner sc....
sc.next();
sc.nextInt();

LAB for today:

read in today's day of the week (as a number)

add 10 days to today (this will figure out when a book that is borrowed today
will be due)

print the day of the week that the book is due (use modulus operator)

extra:  print the day as a String
*/
package Week_4;
import java.util.Scanner;

public class CharAndStrings {

    public static void main(String[] args) {
        char letter = 'A';
        System.out.println("my letter is: " + letter);
        letter = 948;
        System.out.println("now my letter is: " + letter);
        letter = 68;
        System.out.println("now letter is: " + letter);
        // examples of ways to check a character
        if (Character.isUpperCase(letter)) ;
        if (letter >='A' && letter <='Z') ;
        
        String name;
        System.out.println("What is your name? ");
        Scanner sc = new Scanner(System.in);
        name=sc.next(); // reads in a String up until whitespace
        System.out.println("Hello " + name + "!");
        System.out.println("length of my name is: " + name.length());
    }
}
