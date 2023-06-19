/*
 * Ava Fritz
 * 06/11/2023
 * This program:
 * 1. Prompts user to enter a weight in pounds
 * 2. Prompts user to enter a height in inches
 * 3. Performs BMI calculations
 * 4. Returns BMI results
 * 5. Returns BMI information for comparison
 */

import java.util.Scanner;

public class BMI
{
    public static void main( String [] args )
    {
        // Define and initialize variables for values to be input
        int weightPounds = 0;       // First value to be input (weight in pounds)
        int heightInches = 0;      // Second value to be input (height in inches)
    
        // Use a Scanner to input weight
        Scanner inputWeight = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter weight in pounds:\t" );
        weightPounds = inputWeight.nextInt();     // Input first value (weight in pounds)

        // Use a Scanner to input height
        Scanner inputHeight = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter height in inches:\t" );
        heightInches = inputHeight.nextInt(); // Input second value (height in inches)
 
        // Initialize variables for calculations
        final double POUND_TO_KILO = 0.45359237;
        final double INCH_TO_METER = 0.0254;
        double weightKilo = 0.0;
        double heightMeter = 0.0;
        double bodyMassIndex = 0.0;
    
        // Complete calculations required
        weightKilo = weightPounds * POUND_TO_KILO;
        heightMeter = heightInches * INCH_TO_METER;
        bodyMassIndex = weightKilo / (heightMeter*heightMeter);
 
        // Output using System.out.println()
        System.out.println("\n\n" );
        System.out.print("Your BMI is: ");
        System.out.format("%.1f", bodyMassIndex); // round to one decimal place
        System.out.println("\n------------------------");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obese: 30 or greater");
        System.out.println("\n\n");
    }
}