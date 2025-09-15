package Week_3;

import java.util.Scanner;

public class SecondsConversion {

    public static void main(String[] args) {
          //prompt the user for total # of seconds
          Scanner kybd = new Scanner(System.in);
          System.out.print("Enter number of seconds: ");
          int totalSeconds = kybd.nextInt();
          
          //measurement constants
          final int SEC_PER_MIN = 60;
          final int MIN_PER_HR = 60;
          final int SEC_PER_HR = SEC_PER_MIN * MIN_PER_HR;
          
          //conversion
          int hours = totalSeconds / SEC_PER_HR; // # of hours
          int remSeconds = totalSeconds % SEC_PER_HR; //not enough to make a full hr
          int minutes = remSeconds / SEC_PER_MIN;
          int seconds = remSeconds % SEC_PER_MIN; //not enough to make a full min
          
          System.out.print(totalSeconds + " seconds = ");
          System.out.printf("%d hours %d minutes %d seconds\n", hours, minutes, seconds);
          
          
          
          
    }
}
