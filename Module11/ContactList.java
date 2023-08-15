// Ava Fritz
// 8/14/2023
// This program uses a TreeMap class to implement a contact list.
import java.util.*;

public class ContactList 
{
    public static void main( String [] args )
    {
        TreeMap< String, String > contacts = new TreeMap< String, String > ();

        Contacts c1 = new Contacts( "Ava", "Fritz", "0000000000", "ava@ava.com");

        contacts.put(c1.getLastName(), c1.getContact());

        c1.addNewContact();

        contacts.put(c1.getLastName(), c1.getContact());

        System.out.println();

        c1.printHeader();

        for (Map.Entry contact : contacts.entrySet() )
        {
            System.out.println( contact.getKey() + " : " + contact.getValue() );
        }

    }
}
