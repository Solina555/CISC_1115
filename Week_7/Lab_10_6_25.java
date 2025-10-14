/*
Lab: Write 2 methods, in addition to main, and call them.

Method 1: The first method should print your shopping list. It does not return anything.

Method 2: The second method should call the first method and ask the user which item on the
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

public class Lab_10_6_25 {
    public static void main(String[] args){
        int choice = giveUserChoice();
        System.out.println("You chose: " +choice);
    }

    public static void showShoppingList(){
        System.out.println("1. Bread");
        System.out.println("2. Milk");
        System.out.println("3. Egg");
    }

    public static int giveUserChoice(){
        showShoppingList();
        Scanner s = new Scanner(System.in);
        System.out.println("Which is your most important item?");
        int choice = s.nextInt();
        return choice;
    }
}
