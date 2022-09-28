import java.util.ArrayList;
import java.util.Scanner;


public class FrequencyList
{
    /*
      Given a single String word, traverse the String[] line
      to find the number of times word is given in line

      input:
        String word: Word we are looking for
        String[] line: Array of words
      output:
        int: frequency of word in the array line


       }

       return counter;

     */
    public static int get_word_frequencies(String word, String[] line)
    {
        int counter = 0;
        ArrayList<String> freqs = new ArrayList<String>();
        freqs.add(word);
        for(String wordy:line){
            if(freqs.contains(wordy)){
                counter ++;
            }
        }
        return counter;
    }

    /*
        Create a String[] of size numwords that is populated with words a scanner

        input:
            int numwords: the number of words to be expected as input
        output:
            String[]: Array of words that is recieved from user via Scanner

     */
    public static String[] get_words(Scanner input, int numwords){
        String[] a = new String[numwords];
        System.out.print("Enter " + numwords + " words:");

        for(int i = 0; i < numwords; i++){
            a[i] = input.next();
        }
        return a;
    }

    /*
        Go through every element in String[] line and find all
        words

        input:
            String[] line: Array of words
        output:
            ArrayList<String>: An Arraylist containing all the unique words in line

        hint: Arraylists have a method called contains
     */
    public static ArrayList<String> get_unique_words(String[] line)
    {
        ArrayList<String> unique = new ArrayList<String>();
        for(String word:line){
            if(!unique.contains(word)){
                unique.add(word);
            }
        }
        return(unique);
    }

    public static void main(String[] args)
    {
        System.out.print("Enter number of words you will input: ");
        // Implement a Scanner (call it input)
        Scanner input = new Scanner ( System.in );
        // Get an int from the Scanner and save it to numwords
        int numwords = input.nextInt();

        String[] line = get_words(input, numwords);

        ArrayList<String> unique_words = get_unique_words(line);
        for(int i=0;i< unique_words.size();i++)
        {
            int frequency = get_word_frequencies(unique_words.get(i),line);
            System.out.println("Word: " + unique_words.get(i) + "\tFrequency: " + frequency);
        }
    }
}
