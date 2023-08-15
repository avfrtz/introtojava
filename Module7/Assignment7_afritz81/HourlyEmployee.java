/*
 * Ava Fritz
 * 07/17/2023
 * This class extends Employee to create an hourly employee
 * with attributes hourlyPayRate, hoursWorked, and totalEarnings.
 * It calculates totalEarnings from hourlyPayRate and hoursWorked. 
 * An employee that works over 40 hours earns 1.5x pay for the
 * hours worked greater than 40.
 */
public class HourlyEmployee extends Employee
{
    private double hourlyPayRate;
    private int hoursWorked;
    private double totalEarnings;

    /**
     * This method extends the Employee class and considers hourlyPayRate
     * and hoursWorked. It then calculates the totalEarnings based on
     * overtime. It sets the variables in the class.
     * 
     * @author Ava Fritz
     */
    public HourlyEmployee(int id, String fN, String lN, int m, int d, int y, String st, String ci, String sta, int z, double hPR, int hW)
    {
        super( id, fN, lN, m, d, y, st, ci, sta, z );  // Send the variables up to the Employee class
        hourlyPayRate = hPR;  // Set hourlyPayRate
        hoursWorked = hW;  // Set hoursWorked
        if (hoursWorked <= 40)  // Employee worked 40 hours or less
        {
            totalEarnings = hoursWorked*hourlyPayRate;  // Regular pay rate
        }
        else  // Employee worked over 40 hours
        {
            totalEarnings = (40*hourlyPayRate)+((hoursWorked-40)*(hourlyPayRate*1.5));  // Regular pay rate for 40, overtime for anything greater than 40
        }
    }
    
    /**
     * This method returns the hourlyPayRate attribute.
     * 
     * precondition: hourlyPayRate is assigned.
     * postcondition: returns hourlyPayRate as a double.
     * 
     * @author Ava Fritz
     */
    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    /**
     * This method returns the hoursWorked attribute.
     * 
     * precondition: hoursWorked is assigned.
     * postcondition: returns hoursWorked as a int.
     * 
     * @author Ava Fritz
     */
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    /**
     * This method returns the totalEarnings attribute.
     * 
     * precondition: totalEarnings is assigned.
     * postcondition: returns totalEarnings as a double.
     * 
     * @author Ava Fritz
     */
    public double getTotalEarnings()
    {
        return totalEarnings;
    }

}
