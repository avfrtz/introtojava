/*
 * Ava Fritz
 * 07/24/2023
 * This class creates a vehicle from attribute Name ad age.
 * It implements interfaces that draw, resize, rotate, play sounds,
 * or does all 4 actions.
 * 
 * Assumptions:
 * 1. a vehicle has a name ad age.
 */
public class Vehicle implements Drawable, Resizable, Rotatable, Sounds, DRRS
{
    public static String name;
    public static int age;

     /**
     * This method defines a new vehicle with a name attribute. 
     * It sets the name variable.
     * @param newName of type String is the name of the vehicle
     * 
     * @author Ava Fritz
     */
    Vehicle(String newName, int newAge)
    {
        name = newName;
        age = newAge;
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
     * postcondition: name is assigned to newName.
     * 
     * @author Ava Fritz
     */
    public void setName(String newName)
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
    public int getAge()
    {
        return age;
    }
    /**
     * This method sets the name attribute.
     * 
     * precondition: None.
     * postcondition: newAge is assigned to age.
     * 
     * @author Ava Fritz
     */
    public void setAge(int newAge)
    {
        age = newAge;
    }
    /**
     * This method draws a vehicle.
     * 
     * precondition: vehicle is defined.
     * postcondition: Printed statement to draw a vehicle
     * 
     * @author Ava Fritz
     */
    public void drawObject()
    {
        System.out.println("Drawing a Vehicle");
    }
    /**
     * This method resizes a vehicle.
     * 
     * precondition: vehicle is defined.
     * postcondition: Printed statement to resize a vehicle
     * 
     * @author Ava Fritz
     */
    public void resizeObject()
    {
        System.out.println("Resizing a Vehicle");
    }
    /**
     * This method rotates a vehicle.
     * 
     * precondition: vehicle is defined.
     * postcondition: Printed statement to rotate a vehicle
     * 
     * @author Ava Fritz
     */
    public void rotateObject()
    {
        System.out.println("Rotating a Vehicle");
    }
    /**
     * This method plays a vehicle sound.
     * 
     * precondition: vehicle is defined.
     * postcondition: Printed statement to play a vehicle sound
     * 
     * @author Ava Fritz
     */
    public void playSound()
    {
        System.out.println("Vehicle sound");
    }
}
