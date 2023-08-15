public class Vehicle implements Drawable, Resizable, Rotatable, Sounds, DRRS
{
    public static String name;
    public static int age;

    Vehicle(String newName, int newAge)
    {
        name = newName;
        age = newAge;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int newAge)
    {
        age = newAge;
    }
    public void drawObject()
    {
        System.out.println("Drawing a Vehicle");
    }
    public void resizeObject()
    {
        System.out.println("Resizing a Vehicle");
    }
    public void rotateObject()
    {
        System.out.println("Rotating a Vehicle");
    }
    public void playSound()
    {
        System.out.println("Vehicle sound");
    }
}
