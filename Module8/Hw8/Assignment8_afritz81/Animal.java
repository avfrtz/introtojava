/*
 * Ava Fritz
 * 07/24/2023
 * This class creates an animal from attribute Name. 
 * It implements interfaces that draw, resize, rotate, play sounds,
 * or does all 4 actions.
 * 
 * Assumptions:
 * 1. An animal has a name.
 */
public class Animal implements Drawable, Resizable, Rotatable, Sounds, DRRS
{
    // Initalize variables
    public static String name;

    /**
     * This method defines a new Animal with a name attribute. 
     * It sets the name variable.
     * @param newName of type String is the name of the animal
     * 
     * @author Ava Fritz
     */
    Animal(String newName)
    {
        name = newName;
    }
    /**
     * This method returns the name attribute.
     * 
     * precondition: name is assigned.
     * postcondition: returns name as a string.
     * 
     * @author Ava Fritz
     */
    public String getName()
    {
        return name;
    }
    /**
     * This method sets the name attribute.
     * 
     * precondition: None.
     * postcondition: newName is assigned to name.
     * 
     * @author Ava Fritz
     */
    public void setName(String newName)
    {
        name = newName;
    }
    /**
     * This method draws an animal.
     * 
     * precondition: Animal is defined.
     * postcondition: Printed statement to draw an animal
     * 
     * @author Ava Fritz
     */
    public void drawObject()
    {
        System.out.println("Drawing an Animal");
    }
    /**
     * This method resizes an animal.
     * 
     * precondition: Animal is defined.
     * postcondition: Printed statement to resize an animal
     * 
     * @author Ava Fritz
     */
    public void resizeObject()
    {
        System.out.println("Resizing an Animal");
    }
    /**
     * This method rotates an animal.
     * 
     * precondition: Animal is defined.
     * postcondition: Printed statement to rotate an animal
     * 
     * @author Ava Fritz
     */
    public void rotateObject()
    {
        System.out.println("Rotating an Animal");
    }
    /**
     * This method plays an animal sound.
     * 
     * precondition: Animal is defined.
     * postcondition: Printed statement to play an animal sound
     * 
     * @author Ava Fritz
     */
    public void playSound()
    {
        System.out.println("Animal sound");
    }
}
