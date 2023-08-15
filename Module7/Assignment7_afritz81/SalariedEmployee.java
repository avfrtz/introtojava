/*
 * Ava Fritz
 * 07/17/2023
 * This class extends Employee to create a salaried employee
 * with attribute annualSalary.
 */
public class SalariedEmployee extends Employee
{
    private int annualSalary;

    /**
     * This method extends the Employee class and considers annualSalary.
     * It sets the variables in the class.
     * 
     * @author Ava Fritz
     */
    public SalariedEmployee(int id, String fN, String lN, int m, int d, int y, String st, String ci, String sta, int z, int aS)
    {
        super( id, fN, lN, m, d, y, st, ci, sta, z );
        //annualSalary = aS;
    }

    /**
     * This method returns the annualSalary attribute.
     * 
     * precondition: annualSalary is assigned.
     * postcondition: returns annualSalary as an integer.
     * 
     * @author Ava Fritz
     */
    public int getAnnualSalary()
    {
        return annualSalary;
    }

    
}
