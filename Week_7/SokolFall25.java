/* 10/06/2025
   METHODS
   1. modularization allows for easy debugging, maintenance, readability etc
   2. allows code reuse

Lab: 
Write 2 methods, in addition to main, and call them.
Method1:
The first method should print your shopping list. It does not return anything.

Method2:
The second method should call the first method and ask the user which item on the
list is the most important. The method should return the user's choice.

For example your pgm may run as follows:
1. bread
2. milk
3. eggs
Which is your most important item?
1
you chose 1.


pseudocode main:
    int choice = giveUserChoice();
    System.out.println("You chose: " + choice);

pseudocode for giveUserChoice:
    call showShoppingList()
    ask user for most important
    read in the most important
    return user's choice

psuedocode for showShoppingList:
    print any numbered list

 */
package Week_7;
import java.util.Scanner;

public class SokolFall25 {

    public static void main(String[] args) {
        sayHello(); // method call
        
        for (int i=0; i<5; i++) {
            int myNum = getNum();  // take the return value of getNum method and place
            System.out.println("num: " + myNum);
        }
        // into my variable called myNum
        double s = Math.sqrt(26);
       
        sayHello();
        sayHello();
    }
    /**
     * method definition
     */
    public static void sayHello() {
        System.out.println("Hello world!");
    }
    /** 
     * this method reads an integer from the keyboard and returns the value read in.
     * @return num
     */
    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num=sc.nextInt();
        return num;
    }
    
}
