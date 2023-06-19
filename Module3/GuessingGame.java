/*
 * Ava Fritz
 * 06/19/2023
 * This program:
 * 1. Prompts user for positive integer (N)
 * 2. Prompts user for max number of guesses
 * 3. Calculates random integer between 1 and N
 * 4. Prompts user for guesses until max guess or correct answer
 * 5. Gives high/low feedback on guesses
 * 6. Repeats game until user quits
 * Assumptions:
 * 1. N or max guesses less than/equal to 0 is invalid
 * 2. 1 is a valid input
 */

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class GuessingGame
{
    public static void main( String [] args)
    {
        // Initialize counter variable
        int count = 0;        // Keep track of number of guesses
        
        while (count == 0)    // Return true to restart the loop
        {
            // Define and initialize variables
            int highValue = 0;          // First value to be input (N)
            int maxGuess = 0;           // Second value to be input (max guess)
            int currentGuess = 0;       // Store current guess
            int randomNumber = 0;       // Answer to game

            // Use a Scanner to input N
            Scanner inputHighValue = new Scanner( System.in );
            System.out.println( "\n\n" );
            System.out.print( "Enter positive integer:\t");
            highValue = inputHighValue.nextInt();

            // Use a Scanner to input maximum guesses
            Scanner inputMaxGuess = new Scanner( System.in );
            System.out.println( "\n\n" );
            System.out.print( "Enter maximum number of guesses:\t");
            maxGuess = inputMaxGuess.nextInt();

            // Error handling for invalid inputs
            if (highValue <= 0 | maxGuess <= 0)    // Inputs need to be greater than 0
            {
                System.out.println("One or more inputs is invalid. Try again.");
                count = 0;
            }
            else    // Inputs are valid
            {
                // Calculate random number to guess
                randomNumber = (int)( highValue * Math.random() ) + 1;
                count = 0;

                do
                {
                    if (count == maxGuess)    // Stop loop if max guess reached
                    {
                        System.out.println( "Maximum guesses reached. Play again.");
                        count = 0;    // Reset count
                    }
                    else    // Maximum guesses not yet reached
                    {
                        // Use a Scanner to prompt guess
                        Scanner inputCurrentGuess = new Scanner( System.in );
                        System.out.println( "\n\n" );
                        System.out.print( "Enter guess between 1 and " + highValue + ":\t");
                        currentGuess = inputCurrentGuess.nextInt();

                        if (currentGuess == randomNumber)    // Guess is correct
                        {
                            System.out.println( "Correct! Play again.\n" );
                            count = 0;    // Reset count to 0
                        }
                        else if (currentGuess >= randomNumber)    // Guess is too high
                        {
                            System.out.println( "Too high." );
                            count++;    // Increment count by 1
                        }
                        else    // Guess is too low
                        {
                            System.out.println( "Too low." );
                            count++;    // Increment count by 1
                        }
                    }   
                } while (count != 0);    // Repeat until count is reset
            }
        }
    }
} 