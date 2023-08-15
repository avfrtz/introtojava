/*
 * Ava Fritz
 * 8/14/2023
 * This class interacts with the contact list to create new contacts,
 * delete contacts, get contacts, or display all contacts.
 * 
 * Assumptions:
 * 1. A contact has a lastName, firstName, phoneNumber, and emailAddress
 */

import java.util.Map;
import java.util.Scanner;
public class Contacts
{
    public static String firstName;
    public static String lastName;
    public static String phoneNumber;
    public static String emailAddress;

     /**
     * This method defines a new contact and sets the variables.
     * @param fN of type String
     * @param lN of type String
     * @param pN of type String
     * @param eA of type String
     * 
     * @author Ava Fritz
     */
    Contacts(String fN, String lN, String pN, String eA)
    {
        firstName = fN;
        lastName = lN;
        phoneNumber = pN;
        emailAddress = eA;
    }
    /**
     * This method returns the contact info. 
     * 
     * @author Ava Fritz
     */
    public String getContact()
    {
        return firstName + "\t" + phoneNumber + "\t" + emailAddress;
    }
    /**
     * This method returns the lastName. 
     * 
     * @author Ava Fritz
     */
    public String getLastName()
    {
        return lastName;
    }
    /**
     * This method returns the firstName. 
     * 
     * @author Ava Fritz
     */
    public String getFirstName()
    {
        return firstName;
    }
    /**
     * This method returns the phoneNumber. 
     * 
     * @author Ava Fritz
     */
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    /**
     * This method returns the emailAddress. 
     * 
     * @author Ava Fritz
     */
    public String getEmailAddress()
    {
        return emailAddress;
    }
    /**
     * This method adds a new contact to the contact list.
     * 
     * @author Ava Fritz
     */
    public void addNewContact()
    {
        setFirstName();
        setLastName();
        setPhoneNumber();
        setEmailAddress();
    }
    /**
     * This method gets a new contact firstName. 
     * 
     * @author Ava Fritz
     */
    public void setFirstName()
    {
        // Use a Scanner to input first name
        Scanner fN = new Scanner( System.in );
        System.out.println("\n");
        System.out.println("Enter new contact's first name: ");
        firstName = fN.nextLine();

    }
    /**
     * This method gets and sets a new contact lastName. 
     * 
     * @author Ava Fritz
     */
    public void setLastName()
    {
        // Use a Scanner to input last name
        Scanner lN = new Scanner( System.in );
        System.out.println("\n\n");
        System.out.println("Enter new contact's last name: ");
        lastName = lN.nextLine();

    }
    /**
     * This method gets and sets a new contact phoneNumber. 
     * 
     * @author Ava Fritz
     */
    public void setPhoneNumber()
    {
        // Use a Scanner to input last name
        Scanner pN = new Scanner( System.in );
        System.out.println("\n\n");
        System.out.println("Enter new contact's phone number: ");
        phoneNumber = pN.nextLine();
    }
    /**
     * This method gets and sets a new contact emailAddress. 
     * 
     * @author Ava Fritz
     */
    public void setEmailAddress()
    {
        // Use a Scanner to input last name
        Scanner eA = new Scanner( System.in );
        System.out.println("\n\n");
        System.out.println("Enter new contact's email address: ");
        emailAddress = eA.nextLine();
    }
        /**
     * This method prints the contact info headers. 
     * 
     * @author Ava Fritz
     */
    public void printHeader()
    {
        System.out.println("Last\tFirst\tPhone Number\tEmail");
    }
}