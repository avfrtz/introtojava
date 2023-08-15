public class BaseClassExercise 
{
    public static void main( String [] args)
    {
        Derived d = new Derived(10, 20);

        System.out.println("Base value is: " + d.getData());
        System.out.println( "Derived value is: " + d.getSubData());
    }    
}
