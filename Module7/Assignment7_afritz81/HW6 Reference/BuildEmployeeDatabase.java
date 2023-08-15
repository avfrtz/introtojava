/*
 * Ava Fritz
 * 07/10/2023
 * This program prompts a user to input 1 or many employee records,
 * stores the records in an array, and displays the result.
 * 
 * Assumptions:
 * 1. There must be at least 1 employee to input information for.
 * 2. Employee hire date must be a valid date between 1998 and 2023
 * 3. Employee state must be two-digit code (XX)
 * 4. Employee zip code must be 5-digit code (#####)
 */

import java.util.Scanner;

public class BuildEmployeeDatabase
{
    public static void main( String [] args)
    {
        // Initialize variables
        int numEmployees = 0;
        String empNum = "";
        String empName = "";
        String empDate = "";
        String empAddr = "";

        // Initialize potential error messages
        String empAddrError = "INPUT ERROR: State/zip of address is out of range. Try again.";
        String empDateError = "INPUT ERROR: Hire date is out of range. Try again.";

        // Initialize for loop counters
        int i = 0;
        int j = 0;

        // Scanner for number of employees to input
        numEmployees = totalEmployees();

        // Make the length of the array based on the number of employees
        String [][] employeeRecords = new String[numEmployees][4];

        // Loop through the number of employees to input and add to array
        for (i = 0; i < numEmployees; i++)
        {
            // Gather data for each employee and store in variables
            System.out.println("Now entering information for employee #" + (i+1));
            empNum = employeeNumber();  // Scanner for the current employee's number
            empName = employeeName(empNum);  // Scanner for the current employee's first and last names
            empDate = employeeDate(empNum);  // Scanner for the current employee's hire date
            if (empDate == empDateError)  // If the result of employeeDate matches the expected error message, throw an error
            {
                System.out.println(empDateError);
                break;  // break the for loop and end the program
            }
            empAddr = employeeAddress(empNum);  // If the result of employeeAddress matches the expected error message, throw an error
            if (empAddr == empAddrError)
            {
                System.out.println(empAddrError);
                break; // break the for loop and end the program
            }
            System.out.println();
            
            // Input employee information into array
            employeeRecords[i][0] = empNum;
            employeeRecords[i][1] = empName;
            employeeRecords[i][2] = empDate;
            employeeRecords[i][3] = empAddr;
        }

        // Only print employee records if there was not an input error
        if (empDate != empDateError && empAddr != empAddrError)
        {
            System.out.println("List of employee information: ");
            System.out.println("#\t\tName\t\tHired\t\tAddress");

            // Loop through length of array
            for (i = 0; i < employeeRecords.length; i++)
            {
                for (j = 0; j < 4; j++)  // Loop through contents of each array's index
                {
                    System.out.print(employeeRecords[i][j]);  // Print out the employee's information
                    System.out.print("\t\t");
                }
                System.out.print("\n");  // Print a new line between each employee
            }
        }
    }
        /**
     * This method prompts the user for the number of
     * employee records to input. It returns the result.
     * 
     * precondition: None
     * postcondition: Returns number of employees to input
     * 
     * @author: Ava Fritz
     */
    public static int totalEmployees()
    {
        // Define and intialize input variables
        int numEmployees = 0;

        // Use a Scanner to input total number of employees
        Scanner numInputs = new Scanner( System.in );
        System.out.println("\n\n");
        System.out.print("Enter number of employees to input: ");
        numEmployees = numInputs.nextInt();

        return numEmployees;
    }
    public static String employeeNumber()
    {
        // Define and initialize input variables
        int empNumber = 0;

        // Scanner for employee number
        Scanner eNum = new Scanner( System.in );
        System.out.print("Enter employee number: ");
        empNumber = eNum.nextInt();

        // Convert employee number to a string for input to array
        String empNum = Integer.toString(empNumber);

        // Return the employee number
        return empNum;

    }

    /**
     * This method takes in an employee number
     * and prompts the user to input that employee's
     * first and last names. It converts the first
     * and last names to a string using the Name class.
     * 
     * preconditon: employeeNumber is of type String
     * postcondition: Returns result of employee's
     * first and last name converted to string in Name
     * 
     * @author Ava Fritz
     */
    public static String employeeName(String employeeNumber)
    {
        // Define and initialize input variables
        String firstName = "";
        String lastName = "";
        String empName = "";

        // Use a Scanner to input employee name
        Scanner eName = new Scanner( System.in );
        System.out.print("Enter employee " + employeeNumber + " first name: ");
        firstName = eName.nextLine();
        System.out.print("Enter employee " + employeeNumber + " last name: ");
        lastName = eName.nextLine();

        Name n = new Name(firstName, lastName);
        empName = n.getNameString();

        return empName;
    }
    /**
     * This method takes in an employee number
     * and prompts the user to input that employee's
     * date of hire. It converts the month, date,
     * and year to a string using the Date class.
     * The method also verifies that the user inputs
     * are within range using checkMonth, checkDay, and
     * checkYear functions in the Date class.
     * 
     * preconditon: employeeNumber is of type String
     * postcondition: Returns result of employee's
     * hire date converted to string in Date
     * 
     * @author Ava Fritz
     */
    public static String employeeDate(String employeeNumber)
    {
        // Define and initialize input variables
        int hireMonth = 0;
        int hireDay = 0;
        int hireYear = 0;
        String empDate = "";
        String empError = "";
        int checkYear = 0;
        int checkMonth = 0;
        int checkDay = 0;

        // Use a Scanner to input employee hire date
        Scanner eDate = new Scanner( System.in );
        System.out.print("Enter employee " + employeeNumber + " hire month (1-12): ");
        hireMonth = eDate.nextInt();
        System.out.print("Enter employee " + employeeNumber + " hire day (1-31): ");
        hireDay = eDate.nextInt();
        System.out.print("Enter employee " + employeeNumber + " hire year (1990-2023): ");
        hireYear = eDate.nextInt();

        // Call the Date class to create a new Date using user inputs
        Date d = new Date(hireMonth, hireDay, hireYear);

        // Verify that the user inputs are in range using Date functions
        checkYear = d.checkYear();
        checkMonth = d.checkMonth();
        checkDay = d.checkDay();

        // If the user inputs are in range, return the Date string conversion 
        if ((checkYear+checkMonth+checkDay) == 3)
        {
            empDate = d.getDateString();
            return empDate;
        }
        else  // Return the error message
        {
            empError = "INPUT ERROR: Hire date is out of range. Try again.";
            return empError;
        }
    }
    /**
     * This method takes in an employee number
     * and prompts the user to input that employee's
     * address. It converts the street, city, state,
     * and zip code to a string using the Address class.
     * The method also verifies that the user inputs
     * are within range using checkState and
     * checkZip functions in the Address class.
     * 
     * preconditon: employeeNumber is of type String
     * postcondition: Returns result of employee's
     * address converted to string in Address
     * 
     * @author Ava Fritz
     */
    public static String employeeAddress(String employeeNumber)
    {
        // Define and initialize input variables
        String street = "";
        String city = "";
        String state = "";
        int zip = 0;
        String empAddr = "";
        int checkState = 0;
        int checkZip = 0;
        String empError = "";

        // Use a Scanner to input employee hire date (month and day as Strings)
        Scanner eAddr = new Scanner( System.in );
        System.out.print("Enter employee " + employeeNumber + " street: ");
        street = eAddr.nextLine();
        System.out.print("Enter employee " + employeeNumber + " city: ");
        city = eAddr.nextLine();
        System.out.print("Enter employee " + employeeNumber + " state (XX): ");
        state = eAddr.nextLine();

        // Start a new Scanner to input employee hire date (zip as Int)
        Scanner eZip = new Scanner( System.in );
        System.out.print("Enter employee " + employeeNumber + " zip code (#####): ");
        zip = eZip.nextInt();

        // Call the Address class to create a new address using user inputs
        Address a = new Address(street, city, state, zip);

        // Verify that the user inputs are in range using Address functions
        checkState = a.checkState();
        checkZip = a.checkZip();

        // If the user inputs are in range, return the Address string conversion
        if ((checkState+checkZip) == 2)
        {
            // Convert address to a string using Address class method
            empAddr = a.getAddrString();
            return empAddr;
        }
        else  // Return the error message
        {
            // Return the error message
            empError = "INPUT ERROR: State/zip of address is out of range. Try again.";
            return empError;
        }
    }
}
