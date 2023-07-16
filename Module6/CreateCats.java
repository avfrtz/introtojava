public class CreateCats {
    public static void main( String [] args)
    {
        // Create two Cat objects
        Cat catOne = new Cat();
        Cat catTwo = new Cat();

        // Make the cats meow
        System.out.print("cat 1 says "); catOne.meow();
        System.out.print("cat 2 says "); catTwo.meow();
    }
    
}
