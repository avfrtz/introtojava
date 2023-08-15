/*
 * Ava Fritz
 * 07/10/2023
 * This class constructs a date made up of
 * a month, day, and year. It can return
 * the date as a String and verify the 
 * date is in range.
 * Assumptions:
 * 1. Year is between 1990 and 2023
 * 2. Month is between 1 and 12
 * 3. Day is between 1 and 31
 */
public class Date
{
    public static int month;
    public static int day;
    public static int year;

    /**
     * This method gets a month, day, and year
     * and sets them in the class.
     * 
     * precondition: Month, day, and year are given to the Date class
     * postcondition: Sets month, day, and year in the Date class
     * 
     * @author Ava Fritz
     */
    Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    /**
     * This method converts a month, day, and year
     * to String format and returns the result.
     * 
     * precondition: Month, day, and year are defined
     * postcondition: Returns date as a formatted string
     * 
     * @author Ava Fritz
     */
    public String getDateString()
    {
        return month + "/" + day + "/" + year;
    }

    /**
     * This method checks that the year
     * is within the expected range and returns
     * a 1 if true. If the year is out of range, 
     * it returns a 0.
     * 
     * precondition: Year is defined
     * postcondition: 1 if year is within range,
     * 0 if year is outside of range
     * 
     * @author Ava Fritz
     */
    public int checkYear()
    {
        if (year >= 1990 && year <= 2023)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    /**
     * This method checks that the month
     * is within the expected range and returns
     * a 1 if true. If the month is out of range, 
     * it returns a 0.
     * 
     * precondition: Month is defined
     * postcondition: 1 if month is within range,
     * 0 if month is outside of range
     * 
     * @author Ava Fritz
     */
    public int checkMonth()
    {
        if (month >= 1 && month <= 12)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    /**
     * This method checks that the day
     * is within the expected range and returns
     * a 1 if true. If the day is out of range, 
     * it returns a 0.
     * 
     * precondition: Day is defined
     * postcondition: 1 if day is within range,
     * 0 if day is outside of range
     * 
     * @author Ava Fritz
     */
    public int checkDay()
    {
        if (day >= 1 && day <= 31)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
