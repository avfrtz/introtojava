/*
 * Ava Fritz
 * 06/18/2023
 * This program:
 * 1. Prompts user to enter maximum number of asterisks
 * 2. Prompts user for choice in right or inverted triangle
 * 3. Outputs the user's choice with max asterisks as triangle height/width
 * Assumptions:
 * 1. Max asterisks is equal to triangle height/width
 * 2. A max asterisk of 1 results in 1 asterisk
 * 3. A max asterisk of 0 results in a blank line
 * 4. A user choice of anything other than 1 or 2 is invalid
 */

import java.util.Scanner;

public class Triangle 
{
    public static void main( String [] args)
    {
        // Define and initialize variables for values to be input
        int maxAsterisks = 0;    // First value to be input (maximum number of *)
        int userChoice = 0;      // Second value to be input (triangle shape)

        // Use a Scanner to input maximum asterisks
        Scanner inputMaxAsterisks = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter maximum number of asterisks:\t" );
        maxAsterisks = inputMaxAsterisks.nextInt();    // Input first value (maximum *)

        // Use a Scanner to input choice of triangle shape
        Scanner inputChoice = new Scanner ( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter choice of triangle shape, right(1) or inverted(2):\t" );
        userChoice = inputChoice.nextInt();    // Input second value (user choice)

        // Initialize variables for calculations
        final int MAX_ASTERISKS = maxAsterisks;    // Maintain integrity of max asterisks
        final int USER_CHOICE = userChoice;        // Maintain integrity of user choice
        int i = 0;
        int count = 0;    // Counts length of row

        // Error handling for inputs of 0
        System.out.println();    // Print an empty line after user choice

        if (MAX_ASTERISKS == 0)    // Handle case where user inputs 0 for *
        {
            System.out.println();    // Print a blank line
        }
        else    // Create triangle with 1+ asterisks
        {
            if (USER_CHOICE == 1)    // Create a right triangle
            {
                for ( i = 1; i <= MAX_ASTERISKS; i++)    // Increments until row length is max
                {
                    count = 0;    // Counts number of asterisks currently in row
                    while (count < i)    // Repeat until count = desired row length
                    {
                        System.out.print("*");    // Print an *
                        count++;    // Increment count by 1
                    }
                    System.out.println("");    // Print blank line after row complete
                }
            }
            else if (USER_CHOICE == 2)    // Create an inverted triangle
                {
                    for ( i = MAX_ASTERISKS; i >= 1; i--)    // Decrements until row length is 1
                    {
                        count = 0;    // Counts number of asterisks currently in row
                        while (count < i)    // Repeat until count = desired row length
                        {
                            System.out.print("*");    // Print an *
                            count++;    // Increment count by 1
                        }
                        System.out.println("");    // Print blank line after row complete
                    }
                }
            else    // User choice is invalid
            {
                System.out.println( "Invalid triangle choice.");
            }
        }
    }
}