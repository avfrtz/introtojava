/*
 * Ava Fritz
 * 07/10/2023
 * This class constructs an address made up of
 * a street, city, state, and zip. It can return
 * the address as a String and verify the 
 * state/zip is in range.
 * Assumptions:
 * 1. Employee state must be two-digit code (XX)
 * 2. Employee zip code must be 5-digit code (#####)
 */
public class Address
{
    public static String street;
    public static String city;
    public static String state;
    private int zip;

    /**
     * This method gets a street, city, state, and zip
     * and sets them in the class.
     * 
     * precondition: Street, city, state, and zip are given to the Address class
     * postcondition: Sets street, city, state, and zip in the Address class
     * 
     * @author Ava Fritz
     */
    Address(String newStreet, String newCity, String newState, int newZip)
    {
        street = newStreet;
        city = newCity;
        state = newState;
        zip = newZip;
    }
    /**
     * This method converts a street, city, state, and zip
     * to String format and returns the result.
     * 
     * precondition: Street, city, state, and zip are defined
     * postcondition: Returns date as a formatted string
     * 
     * @author Ava Fritz
     */
    public String getAddrString()
    {
        return street + ", " + city + ", " + state + " " + zip;
    }
    /**
     * This method checks that the state
     * is within the expected range and returns
     * a 1 if true. If the state is out of range, 
     * it returns a 0.
     * 
     * precondition: State is defined
     * postcondition: 1 if state is within range,
     * 0 if state is outside of range
     * 
     * @author Ava Fritz
     */
    public int checkState()
    {
        if (state.length() == 2)  // If the state is 2 (standard state acronym)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    /**
     * This method checks that the zip
     * is within the expected range and returns
     * a 1 if true. If the zip is out of range, 
     * it returns a 0.
     * 
     * precondition: Zip is defined
     * postcondition: 1 if zip is within range,
     * 0 if zip is outside of range
     * 
     * @author Ava Fritz
     */
    public int checkZip()
    {
        String zipStr = Integer.toString(zip);  // Convert the int to String to check length
        if (zipStr.length() == 5)  // If length is 5 (standard zip code)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
