/*
 * Ava Fritz
 * 07/10/2023
 * This class constructs a name made up of
 * a first name and last name. It can return
 * the name as a String.
 */
public class Name
{
    public static String firstName;
    public static String lastName;

    /**
     * This method gets a first name and last name
     * and sets them in the class.
     * 
     * precondition: First name and last name are given to the Name class
     * postcondition: Sets first name and last name in the Name class
     * 
     * @author Ava Fritz
     */
    Name(String newFirstName, String newLastName)
    {
        firstName = newFirstName;
        lastName = newLastName;
    }

    /**
     * This method converts a first name and last name
     * to String format and returns the result.
     * 
     * precondition: First name and last name are defined
     * postcondition: Returns name as a formatted string
     * 
     * @author Ava Fritz
     */
    public String getNameString()
    {
        return lastName + ", " + firstName;
    }
}
