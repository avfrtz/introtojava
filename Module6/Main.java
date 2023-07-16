import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Shirt s = new Shirt("White", 'M');  // makes new shirt
        s.putOn();
        s.takeOff();

        System.out.println(s.color);
        System.out.println(s.size);

        Scanner scan = new Scanner();
    }
}