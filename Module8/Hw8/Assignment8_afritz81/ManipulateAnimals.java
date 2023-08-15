/*
 * Ava Fritz
 * 07/24/2023
 * This program polymorphically calls functions to draw, rotate,
 * resize, and play the sounds of objects of type Animal and Vehicle.
 * 
 * Assumptions:
 * 1. Animal has a name.
 * 2. Vehicle has a name and age.
 */
public class ManipulateAnimals
{
    public static void main( String [] args)
    {
        // Create an array of objects that can implement DRRS interface (draw, rotate, resize, sounds)
        DRRS [] drawRotateResizeSound = {new Animal("Pug"), new Animal("Elephant"), new Vehicle("Bus", 2), new Vehicle("Scooter", 12)};

        // Print a blank line to prepare for output
        System.out.println();

        // Loop through the array of objects until the last object in the array is reached
        for( int i = 0; i < drawRotateResizeSound.length; i++)
        {
            drawRotateResizeSound[i].drawObject();  // Execute the interface to draw an object
            drawRotateResizeSound[i].rotateObject();  // Execute the interface to rotate an object
            drawRotateResizeSound[i].resizeObject();  // Execute the interface to resize an object
            drawRotateResizeSound[i].playSound();  // Execute the interface to play an object sound
        }
    }    
}
