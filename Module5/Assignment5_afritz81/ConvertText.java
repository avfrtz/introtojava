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
 * 4. Conversion type 0 accepts English sentences only
 * 5. Conversion type 1 accepts Morse Code sentences only
 */

import java.util.Scanner;

public class ConvertText
{
    public static void main( String [] args)
    {
        // Call function to convert sentence
        conversionType();
    }
    
    /*
     * This method prompts the user for conversion type.
     * Based on conversion type selected, the method will
     * call initialSentence to prompt the user for a sentence
     * to translate. If case is 0, the method will call convertInput
     * to translate the sentence from English to Morse Code.
     * If case is 1, the method will call convertInput to translate the
     * sentence from Morse Code to English.
     * 
     * precondition: User input is integer type of 0 or 1
     * postcondition: Sentence is translated according to case selected.
     */
    public static void conversionType()
    {
        // Define and initialize input variables
        int userType = 0;    // First value to be input (conversion type)
        String inputStr = "";    // Second value to be input (user sentence)


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
                        inputStr = initialSentence();    // Scan and store user sentence
                        convertInput(inputStr, userType);    // Convert user sentence based on case
                        break;
            
            case 1:
                        System.out.println( "Translating Morse Code to English" );
                        inputStr = initialSentence();    // Scan and store user sentence
                        convertInput(inputStr, userType);    // Convert user sentence based on case
                        break;
            default:
                        System.out.println( "Invalid data: you must enter an integer 0-1" );    // Invalid input
        }
    }
    /**
     * This method prompts the user for a sentence to translate.
     * 
     * precondition: User input is of type String.
     * precondition: For case 0, user input is an English sentence.
     * precondition: For case 1, user input is a Morse Code sentence.
     * postcondition: Returns user sentence
     * 
     * @author Ava Fritz
     */
    public static String initialSentence()
    {
        // Define and initialize input variables
        String userSentence = "";    // First value to be input (sentence)

        // Use a Scanner to input sentence
        Scanner inputSentence = new Scanner( System.in );
        System.out.print( "Enter a sentence to translate: ");
        userSentence = inputSentence.nextLine();    // Input first value (user sentence)
        return userSentence;
    }
    /**
     * This method takes in a String (a) for user sentence and integer (b)
     * for conversion type. If b is 0, a is converted from English to
     * Morse Code. If b is 1, a is converted from Morse Code to English.
     * @param a is the user input string
     * @param b is the conversion type int
     * 
     * precondition: a is String type
     * precondition: b is int type (0-1)
     * precondition: if b is 0, a is an English sentence
     * precondition: if b is 1, a is a Morse Code sentence
     * postcondition: Print converted String to user
     * 
     * @author Ava Fritz
     */
    public static void convertInput(String a, int b)
    {
        // Initialize variables
        int lenStr = a.length();    // length of user input sentence
        int i = 0;    
        int j = 0;

        // Declare and initialize 2D array with English to Morse mappings
        String [][] engMorseArray = {{"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."}, {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"}, {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"}, {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"}, {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"}, {"Z", "--.."}, {"1", ".----"}, {"2", "..---"}, {"3", "...--"}, {"4", "....-"}, {"5", "....."}, {"6", "-...."}, {"7", "--..."}, {"8", "---.."}, {"9", "----."}, {"0", "-----"}, {" ", "|"}};
        int lenArray = engMorseArray.length;    // Determine length of array rows

        if (b == 0)    // Convert an English sentence 
        {
            String engUpper = a.toUpperCase();    // Make sure all letters are uppercase
            for (i = 0; i < lenStr; i++)    // Step through the characters in the input
            {
                for (j = 0; j < lenArray; j++)    // Check contents of engMorseArray
                {
                    if (String.valueOf(engUpper.charAt(i)).equals(engMorseArray[j][0]))    // If the next letter finds a match in the array
                    {
                        System.out.print(engMorseArray[j][1]);    // Print the Morse code for the letter
                        System.out.print(" ");   // Put a space to delineate letters
                    }
                }
            }
        }
        else    // Convert a Morse sentence
        {
            String morseBlock = "";
            for (i = 0; i < lenStr; i++)    // Step through the characters in the input
            {
                if (!(String.valueOf(a.charAt(i)).equals(" ")))
                {
                    if (i == lenStr-1)  // Final letter in sentence
                    {
                        morseBlock = morseBlock + String.valueOf(a.charAt(i));    // Store inputs between spaces
                        for (j = 0; j < lenArray; j++)    // Check contents of engMorseArray
                        {
                            if (morseBlock.equals(engMorseArray[j][1]))    // If the next block finds a match in the array
                            {
                                System.out.print(engMorseArray[j][0]);    // Print the English for the letter
                            }
                        }
                    }
                    else    // Build a block of . and - to create morse code letters
                    {
                        morseBlock = morseBlock + String.valueOf(a.charAt(i));
                    }
                }
                else if (String.valueOf(a.charAt(i)).equals(" "))    // Space between letters indicates block is ready to translate
                {
                    for (j = 0; j < lenArray; j++)    // Check contents of engMorseArray
                    {
                        if (morseBlock.equals(engMorseArray[j][1]))    // If the next block finds a match in the array
                        {
                            System.out.print(engMorseArray[j][0]);    // Print the English for the letter
                        }
                    }
                    morseBlock = "";    // Reset the block after each letter is translated
                }
            }
        }
    }
}