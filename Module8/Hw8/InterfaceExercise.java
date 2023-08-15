public class InterfaceExercise
{
    public static void main( String [] args)
    {
        Animal a1 = new Animal("Pug");
        Animal a2 = new Animal("Elephant");
        Vehicle v1 = new Vehicle("Camaro", 3);
        Vehicle v2 = new Vehicle("Kia", 12);
        DRRS [] drawableObjects = {a1, a2, v1, v2};
        /**
        Resizable [] resizableObjects = {
            new Animal(), new Animal()
        };
        Rotatable [] rotatableObjects = {
            new Animal(), new Animal()
        };
        Sounds [] soundObjects = {
            new Animal(), new Animal()
        };
        **/
        System.out.println();

        for( int i = 0; i < drawableObjects.length; i++)
        {
            drawableObjects[i].drawObject();
            drawableObjects[i].resizeObject();
            drawableObjects[i].rotateObject();
            drawableObjects[i].playSound();
        }
    }    
}
