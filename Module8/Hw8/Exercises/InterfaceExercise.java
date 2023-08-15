public class InterfaceExercise
{
    public static void main( String [] args)
    {
        DrawAndRotate [] drawableObjects = {
            new Cat(), new Chihuahua()
        };

        System.out.println();

        for( int i = 0; i < drawableObjects.length; i++)
        {
            drawableObjects[i].draw();
            drawableObjects[i].rotate();
        }
    }    
}
