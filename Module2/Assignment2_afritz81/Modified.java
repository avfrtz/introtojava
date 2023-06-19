/*
 * Ava Fritz
 * 06/11/2023
 * Modified program that:
 * 1. Takes in any 6 integers
 * 2. Performs calculations
 * 3. Returns formatted results
 */

import java.util.Scanner;

public class Modified
{
    public static void main( String [] args )
    {
        // Define and initialize variables for values to be input
        int v1 = 0;      // First value to be input
        int v2 = 0;      // Second value to be input
        int v3 = 0;      // Third value to be input
        int v4 = 0;      // Fourth value to be input
        int v5 = 0;      // Fifth value to be input
        int v6 = 0;      // Sixth value to be input
    
        // Use a Scanner to input integer values
        Scanner input = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter 6 integers separated by a blank space:" );
        v1 = input.nextInt();     // Input first value
        v2 = input.nextInt();     // Input second value
        v3 = input.nextInt();     // Input third value
        v4 = input.nextInt();     // Input fourth value
        v5 = input.nextInt();     // Input fifth value
        v6 = input.nextInt();     // Input sixth value

        // Initialize variables for calculations
        int col1 = 0;
        int col2 = 0;
        int row1 = 0;
        int row2 = 0;
        int row3 = 0;
        int all = 0;
    
        // Complete calculations required
        col1 = (v1 + v3 + v5);
        col2 = (v2 + v4 + v6);
        row1 = (v1 + v2);
        row2 = (v3 + v4);
        row3 = (v5 + v6);
        all = (v1 + v2 + v3 + v4 + v5 + v6);

        // Output using System.out.println()
        System.out.println( "\n\n" );
        System.out.println( "\t" + "Value" + "\t" + "Value" + "\t" + "Total" );
        System.out.println( "\t" + v1 + "\t" + v2 + "\t" + row1);
        System.out.println( "\t" + v3 + "\t" + v4 + "\t" + row2);
        System.out.println( "\t" + v5 + "\t" + v6 + "\t" + row3);
        System.out.println( "\t" + "----" + "\t" + "----" + "\t" + "----");
        System.out.println( "Total" + "\t" + col1 + "\t" + col2 + "\t" + all);
        System.out.println( "\n\n" );
    }
}