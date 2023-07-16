/*
 * Ava Fritz
 * 07/01/2023
 * This program simulates a tortoise and hare race. It displays
 * the current positions of the race with each move that takes 
 * place. Tortoise and hare moves are calculated using random
 * integers between 1-10 that are assigned values to progress
 * (or fall behind, or nap!).
 * Assumptions:
 * 1. Both tortoise and hare start at position 1.
 * 2. The winner of the race crossed position 51 first.
 * 3. The winner is calculated after both animals complete their move.
 * 4. Ties are acceptable.
 * 5. Both animals cannot slip behind position 1.
 */
public class Race
{
    public static void main( String [] args)
    {
        // Declare initial positions
        int tortoiseCurrent = 1;
        int hareCurrent = 1;

        // Print the starting message
        System.out.println("AND THEY'RE OFF!!");

        // Start the while loop to commence the race
        while (tortoiseCurrent < 51 && hareCurrent < 51)
        {
            // Calculate animal position by adding current position with result of move
            tortoiseCurrent = tortoiseCurrent + tortoiseMove();    
            hareCurrent = hareCurrent + hareMove();  

            // If the tortoise slips behind 1, reset current position to 1
            if (tortoiseCurrent < 1)
            {
                tortoiseCurrent = 1;
            }
            
            // If the hare slips behind 1, reset current position to 1
            if (hareCurrent < 1)
            {
                hareCurrent = 1;
            }

            // Show the current positions of the race
            System.out.print("\n");  // Print a new line between each move
            displayRace(tortoiseCurrent, hareCurrent);
        }

        if (tortoiseCurrent >= 51 && hareCurrent < 51)  // Tortoise has reached position 51 first
        {
            System.out.println("\nTORTOISE WINS!!");
        }
        else if (hareCurrent >= 51 && tortoiseCurrent < 51)  // Hare has reached position 51 first
        {
            System.out.println("\nHARE WINS!!");
        }
        else if (hareCurrent >= 51 && tortoiseCurrent >= 51) // Tortoise and hare reached position 51 in same move
        {
            System.out.println("\nIT'S A TIE!!");
        }
    }
    /**
     * This method calculates the tortoise's next move by
     * drawing a random integer that is compared against
     * the probabiltiy of a fast plod, slow plod, and slip.
     * The method returns the result of the probability
     * draw.
     * 
     * precondition: None
     * postcondition: Returns result of random integer probability draw
     * 
     * @author Ava Fritz
     */
    public static int tortoiseMove()
    {
        // Initialize and reset variables with each loop
        int tortoiseRoll = 0;

        // Calculate a random integer between 1 and 10 to determine move
        tortoiseRoll = (int)(10 * Math.random() ) + 1;

        // Return result based on random move
        if (tortoiseRoll <= 5)  // Roll is between 1 and 5
        {
            return 3;  // Fast plod moves 3 squares to the right
        }
        else if (tortoiseRoll <= 8)  // Roll is between 6 and 8
        {
            return 1;  // Slow plod moves 1 square to the right
        }
        else  // Roll is between 9 and 10
        {
            return -6;  // Slip moves 6 squares to the left
        }

    }
    /**
     * This method calculates the hare's next move by
     * drawing a random integer that is compared against
     * the probabiltiy of a big hop, small hop, big slip,
     * small slip, and fall asleep. The method returns the 
     * result of the probability
     * draw.
     * 
     * precondition: None
     * postcondition: Returns result of random integer probability draw
     * 
     * @author Ava Fritz
     */
    public static int hareMove()
    {
        // Initialize and reset variables with each loop
        int hareRoll = 0;

        // Calculate a random integer between 1 and 10 to determine move
        hareRoll = (int)(10 * Math.random() ) + 1;

        // Return result based on random move
        if (hareRoll <= 2)  // Roll is between 1 and 2
        {
            return 9;  // Big hop moves 9 squares to the right
        }
        else if (hareRoll <= 5)  // Roll is between 3 and 5
        {
            return 1;  // Small hop moves 1 square to the right
        }
        else if (hareRoll == 6)  // Roll is a 6
        {
            return -12;  // Big slip moves 12 squares to the left
        }
        else if (hareRoll <= 8)  // Roll is between 7 and 8
        {
            return -2;  // Small slip moves 2 squares to the left
        }
        else  // Roll is between 9 and 10
        {
            return 0;  // Fall asleep does not move
        }
    }
    /**
     * This method displays the current standings of the 
     * tortoise and hare race using the current positions
     * of the tortoise and hare. If the tortoise is occupying
     * a space, it prints "T". If the hare is occupying a
     * space, it prints "H". If both animals are on the 
     * same space, it prints "OUCH!!" to show the tortoise
     * biting the hare. If neither animal is occupying a
     * space, the space is displayed as an empty block (" ").
     * 
     * @param tC is the current tortoise position
     * @param hC is the current hare position
     * 
     * precondition: tC is int type (1-50)
     * precondition: tC is int type (1-50)
     * postcondtion: visual representation of race is displayed in command line
     * 
     * @author Ava Fritz
     */
    public static void displayRace(int tC, int hC)
    {
        // Initialize and reset variable with each loop
        int i = 1;

        // Print the current standings of the race
        for (i = 1; i < 52; i++)  // Loop through positions 1-51 (50 total)
        {
            if (i != tC && i != hC)  // Neither animal occupies space
            {
                System.out.print(" ");  // Print an empty space if neither animal occupies it
            }
            else if (i == tC && i == hC)  // Tortoise bites hare
            {
                System.out.print("OUCH!!");  // Print "OUCH!!" when both animal on same space
            }
            else if (i == tC && i != hC)  // Tortoise occupies space
            {
                System.out.print("T");  // Print "T" when tortoise occupies space
            }
            else if (i != tC && i == hC) // Hare occupies space
            {
                System.out.print("H");
            }
        }
    }
}