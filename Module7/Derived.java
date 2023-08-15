public class Derived extends Base
{
    private int subData;

    public int getSubData()
    {
        return subData;
    }

    public Derived (int b, int d)
    {
        super( b );
        subData = d;
    }
    
}
