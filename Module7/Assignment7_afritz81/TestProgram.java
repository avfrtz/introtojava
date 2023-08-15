public class TestProgram 
{
    public static void main( String [] args)
    {
        // Build the salaried employee
        SalariedEmployee s = new SalariedEmployee(1, "Ava", "Fritz", 7, 31, 1998, "Center Blvd", "Orlando", "FL", 32801, 50000);
        
        // Build the hourly employee that works 40 hours or less
        HourlyEmployee h1 = new HourlyEmployee(2, "Mava", "Frotz", 2, 28, 2020, "Left Blvd", "Philadelphia", "PA", 19119, 30, 25);
        
        // Build the hourly employee that works over 40 hours
        HourlyEmployee h2 = new HourlyEmployee(3, "Bava", "Freetz", 12, 1, 2005, "Right Blvd", "Storrs", "CT", 62680, 50, 45);
        
        System.out.println("Employee Records:");
        System.out.println(s.getNumber() + "\t" + s.getName() + "\t" + s.getDate() + "\t" + s.getAddress() + "\t" + s.getAnnualSalary());
        System.out.println(h1.getNumber() + "\t" + h1.getName() + "\t" + h1.getDate() + "\t" + h1.getAddress() + "\t" + h1.getHourlyPayRate() + "\t" + h1.getHoursWorked() + "\t" + h1.getTotalEarnings());
        System.out.println(h2.getNumber() + "\t" + h2.getName() + "\t" + h2.getDate() + "\t" + h2.getAddress() + "\t" + h2.getHourlyPayRate() + "\t" + h2.getHoursWorked() + "\t" + h2.getTotalEarnings());

    }
    
}
