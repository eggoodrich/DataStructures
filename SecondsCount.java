import java.util.Scanner;
public class SecondsCount {
    /*
        Calculate the number of seconds in a given number of hours

        input: int hours
        output: int seconds
     */
    public static int howManySeconds(int hours) {
        int seconds;
        seconds = hours * 3600;
        return(seconds);
    }

    /*
        Your input should be a non-negative integer
     */
    public static void main(String[] args) {
        int hours, seconds;
        // Read input from Scanner
        Scanner scnr = new Scanner (System.in);

        // Get hours from your input
        hours = scnr.nextInt();
        // Call function howManySeconds(hours) to calculate number of seconds
        seconds = howManySeconds(hours);
        System.out.println("second = " + seconds);
    }
}
