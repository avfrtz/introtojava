/*
 * Ava Fritz
 * 07/01/2023
 * This program converts an input String from English
 * to Morse code, or vice versa, and outputs it. 
 * The user inputs the conversion type followed by 
 * the sentence in either English or Morse code.
 * Assumptions:
 * 1. Spaces in Morse Code are input as "|"
 * 2. Punctuation in Morse Code are not converted
 * 3. Words up to one sentence are supported
 */

import java.util.Scanner;

public class ConvertText
{
    public static void main( String [] args)
    {
        // Call function for input variables
        conversionType();
    }
    
    public static void conversionType()
    {
        // Define and initialize input variables
        int userType = 0;    // First value to be input (conversion type)
        String englishStr = "";
        String morseStr = "";

        // Use a Scanner to input conversion type
        Scanner inputType = new Scanner( System.in );
        System.out.println( "\n\n ");
        System.out.print( "Conversion Types supported:\n");
        System.out.print( "0 - English to Morse Code\n");
        System.out.print( "1 - Morse Code to English\n");
        System.out.print( "Enter conversion type (0-1): ");
        userType = inputType.nextInt();    // Input first value (conversion type)

        // Conversion based on user input (conversion type)
        switch( userType )
        {
            case 0:
                        System.out.println( "Translating English to Morse Code" );
                        englishStr = initialSentence();
                        englishToMorse(englishStr);
                        break;
            
            case 1:
                        System.out.println( "Translating Morse Code to English" );
                        morseStr = initialSentence();
                        morseToEnglish(morseStr);
                        break;
            default:
                        System.out.println( "Invalid data: you must enter an integer 0-1" );
        }
    }
    public static String initialSentence()
    {
        // Define and initialize input variables
        String userSentence = "";    // First value to be input (sentence)

        // Use a Scanner to input sentence
        Scanner inputSentence = new Scanner( System.in );
        System.out.print( "Enter a sentence to translate: ");
        userSentence = inputSentence.nextLine();    // Input first value (user sentence)
        System.out.println(userSentence);
        return userSentence;
    }
    public static void englishToMorse(String a)
    {
        // Initialize variables
        int lenStr = a.length();
        System.out.println(lenStr);
        String [][] engMorseArray = {{"A", ".-"}, {"B", "-..."}};
        if (String.valueOf(a.charAt(0)).equals(engMorseArray[0][0]))
        {
            System.out.println(engMorseArray[0][1]);
        }
        else
        {
            System.out.println("Not it");
        }

    }
    public static void morseToEnglish(String b)
    {
        // Initialize variables
        
    }
}