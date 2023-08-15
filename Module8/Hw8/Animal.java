public class Animal implements Drawable, Resizable, Rotatable, Sounds, DRRS
{
    public static String name;

    Animal(String newName)
    {
        name = newName;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void drawObject()
    {
        System.out.println("Drawing an Animal");
    }
    public void resizeObject()
    {
        System.out.println("Resizing an Animal");
    }
    public void rotateObject()
    {
        System.out.println("Rotating an Animal");
    }
    public void playSound()
    {
        System.out.println("Animal sound");
    }
}
