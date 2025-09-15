/* 9/8/2025
   VARIABLES AND EXPRESSIONS (CHAPTER 2)
   We spoke about all data in a java program having a data type
   eg. String 
       integer 109
       double (floating point number)

   literal means an actual value (eg 109 is an integer literal, "Hello" is
   a string literal)
   a variable can take on different values
The assignment operator = copies whatever is on the right into what is on the left.
The left has to be a variable
An expression in Java consists of variables, operators, literals
example: charge + charge*taxes
% in java does NOT mean percent so it is the job of the programmer to either 
divide by 100 or move the decimal point 2 places.
There is no exponent operator in java

*  /  mul div
+  -  add sub

Need to talk about:
++, --
x=x+1;
x+=1;
printing a certain number of digits
What is the % used for -- Modulus or Remainder of a division
integer division (we saw the example of 1/2)
some other methods in the Math class
 */
package Week_3;

public class Program3 {

    public static void main(String[] args) {
        int charge;
        charge = 32;
        System.out.println("Charge: " + charge);
        
        final double taxes = .08875;
        
        // assignment of an int to a double is OK
        // charge = 1.5; // no good, you cannot assign a double to an int
        // if you want to truncate everything after the decimal point
        // you can cast the double to an int by using ()
        double amount = 1.7;
        int newAmount = (int)(amount+3.4); // this converts the double to an int type
        System.out.println("now amount is: " + newAmount + " amount is: " + amount);
        // 2.3=amount; no good
        // you can print the answer to an expression
        System.out.println("Total charge: " + (charge + charge*taxes));
        // or you can assign the answer to another variable
        double totalCharge=charge + charge*taxes;
        System.out.println("Total charge: " + totalCharge);
        System.out.printf("Total charge: %.2f \n", totalCharge);
        
        
        System.out.println("absolute value: " + Math.abs(amount));
        int count=0;
        int sum=56;
        // example of a runtime error
        // System.out.println(sum/count); // divide by zero Exception 
        count++; // count+=1;  count=count+1;
        count++;
        count+=3;
        count=count+2;
        double halfIt=1.0/2;
        System.out.println("halfIt: " + halfIt);
        
        System.out.println("37 mod 5 is: " + (37%5));
    }
}
