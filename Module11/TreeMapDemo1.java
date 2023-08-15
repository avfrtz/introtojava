// Ava Fritz
// 8/14/2023
// This program uses a TreeMap class to implement a contact list.
import java.util.*;
public class TreeMapDemo2 
{
    public static void main( String [] args )
    {
        TreeMap< String, String > products = new TreeMap< String, String > ();

        products.put( "Ava", "Staples" );
        products.put( "Pepper", "Paper Clips");
        products.put( "Ginger", "Rubber Bands");

        System.out.println();

        for (Map.Entry product : products.entrySet() )
        {
            System.out.println( product.getKey() + " : " + product.getValue() );
        }

        System.out.println("\n\nProduct for code 100 is " + products.get( "Ginger" ));
    }
}
