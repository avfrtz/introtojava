/*
 * Ava Fritz
 * 07/10/2023
 * This class creates an employee from attributes defined in Name,
 * Address, and Date classes.
 * 
 * Assumptions:
 * 1. There must be at least 1 employee to input information for.
 * 2. Employee hire date must be a valid date between 1998 and 2023
 * 3. Employee state must be two-digit code (XX)
 * 4. Employee zip code must be 5-digit code (#####)
 */

public class Employee
{
    private String name;
    private String date;
    private String address;
    private int number;


    /**
     * This method takes in the employee number, first name, last name, month,
     * day, year, street, city, state, and zip code of an employee. It builds
     * an Employee using the Name, Date, and Address classes and sets the
     * name, date, address, and number variables.
     * 
     * @author Ava Fritz
     */
    public Employee(int id, String fN, String lN, int m, int d, int y, String st, String ci, String sta, int z)
    {
        // Set the employee number to id
        number = id;

        // Pass the first/last names to Name and get the formatted output
        Name n = new Name(fN, lN);
        name = n.getNameString();

        // Pass the month, day, and year to Date and get the formatted output
        Date hire = new Date(m, d, y);
        if (hire.checkMonth() + hire.checkDay() + hire.checkYear() == 3)  // Check that the inputs are valid
        {
            date = hire.getDateString();  // Set the date variable
        }
        else
        {
            System.out.println("Error: incorrect input for date.");
            System.exit(0);  // Quit the program on error
        }

        // Pass the street, city, state, and zip to Address and get the formatted output
        Address addr = new Address(st, ci, sta, z);
        if (addr.checkState() + addr.checkZip() == 2)  // Check that the inputs are valid
        {
            address = addr.getAddrString();  // Set the address variable
        }
        else
        {
            System.out.println("Error: incorrect input for address.");
            System.exit(0);  // Quit the program on error
        }
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
     * This method returns the date attribute.
     * 
     * precondition: date is assigned.
     * postcondition: returns date as a string.
     * 
     * @author Ava Fritz
     */
    public String getDate()
    {
        return date;
    }

    /**
     * This method returns the address attribute.
     * 
     * precondition: address is assigned.
     * postcondition: returns address as a string.
     * 
     * @author Ava Fritz
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * This method returns the number attribute.
     * 
     * precondition: number is assigned.
     * postcondition: returns number as an integer.
     * 
     * @author Ava Fritz
     */
    public int getNumber()
    {
        return number;
    }
}
