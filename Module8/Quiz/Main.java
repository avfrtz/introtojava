public class Main 
{
    public static void main( String [] args)
    {
        String st1 = "Now is the time for all";
        String st2 = new String("buffalo");
        String st3 = st1;

        if (st3.equals(st2))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        System.out.println(st1.substring(4, 15));
    }
    
}
