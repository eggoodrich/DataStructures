import java.util.Scanner;
public class ReverseOrder {

    /*
        Reverse your input array

        input:
            int numElements: Should be greater than one
            int[] intList: an array of (numElements) elements
        output:
            int[] : an int[] of intList in reverse

           Example: ReverseArray(3, [1,2,3]) ===> [3,2,1]

     */
    public static int[] ReverseArray(int numElements, int[] intList) {
        int[] newArr = new int [numElements];
        int count = 0;
        for(int i = numElements-1; i >= 0; i--){
            newArr[count] = intList[i];
            count++;
        }
        return(newArr);
    }
    /*
        Your first input (number of integers that follow by spaces) should be positive.

        Example:
            User input: 3 1 2 4
            Your output: 4 2 1
            Explanation: 3 is number of integers, 1 2 4 are elements of the array
     */

    public static void main(String[] args) {
        int numElements;
        int[] intData;
        int i;
        int[] intList;
        System.out.print("Enter your input: ");
        // Initialize a Scanner for system input
        Scanner scnr = new Scanner (System.in);

        // Read the next integer from the Scanner and save to your numElements
        numElements = scnr.nextInt();

        // initilize intList with numElement size
        intList = new int[numElements];

        // create a loop that reads in the next int from the scanner to the intList
        for(i = 0; i < numElements; i++){
            intList[i] = scnr.nextInt();
        }


        // call the ReverseArray function
        intData = ReverseArray(numElements, intList);

        System.out.print("Your output is: ");
        // print the output from ReverseArray

        for(int j = 0; j < numElements; j++){
            System.out.print(intData[j]);
            System.out.print(" ");
        }
    }
}

