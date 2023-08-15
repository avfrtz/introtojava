public class InheritanceProgrammingExercise
{
    public static void main( String [] args)
    {
        EnhancedRectangle r1 = new EnhancedRectangle();
        EnhancedRectangle r2 = new EnhancedRectangle();

        r1.setLength(40);
        r1.setWidth(30);
        r2.setLength(60);
        r2.setWidth(50);

        System.out.println("R1 length: " + r1.getLength());
        System.out.println("R1 width: " + r1.getWidth());
        System.out.println("R2 length: " + r2.getLength());
        System.out.println("R2 width: " + r2.getWidth());

        System.out.println("R1 area: " + r1.getArea());
        System.out.println("R2 area: " + r2.getArea());
    }
    
}
