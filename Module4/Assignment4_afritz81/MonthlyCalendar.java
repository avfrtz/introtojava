/*
* Ava Fritz
* 06/25/2023
* This program:
* 1. Takes user input for month (1-12) and year (YYYY)
* 2. Outputs a calendar for that month
* Assumptions:
* 1. Leap years are considered
* 2. Day of interest is first day of month
* 3. No Java date libraries
*/

import java.util.Scanner;

public class MonthlyCalendar
{
    public static void main( String [] args)
    {
        // Define and initialize input variables
        int userMonth = 0;    // First value to be input (month)
        int userYear = 0;     // Second value to be input (year)

        // Use a Scanner to input month
        Scanner inputMonth = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter month (1-12): ");
        userMonth = inputMonth.nextInt();    // Input first value (month)

        // Use a Scanner to input year
        Scanner inputYear = new Scanner( System.in );
        System.out.println( "\n\n" );
        System.out.print( "Enter year (YYYY): ");
        userYear = inputYear.nextInt();    // Input second value (year)

        // Determine if leap year
        boolean leapYear = false;
        leapYear = isLeapYear(userYear);

        // Get the name of the month
        String monthName = "";
        monthName = getMonthName(userMonth);

        // Get the number of days in the month
        int daysMonth = 0;
        daysMonth = getNumDaysInMonth(userMonth, userYear);
        System.out.println("Here are days in month: " + daysMonth);

        // Get the start day of the month
        int startDay = 0;
        startDay = getStartDay(userMonth, 1, userYear);
        System.out.println("Here is the start day: " + startDay);
    }
    public static boolean isLeapYear(int y)
    {
        if ( y % 4 == 0)
        {
            if ( y % 100 != 0)
            {
                return true;
            }
            else if ( y % 400 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static String getMonthName(int m)
    {
        // Initialize
        String monthName = "";
        // Map the numbers to the month names using a switch case
        switch ( m )
        {
            case 1:     
                        monthName = "January";
                        break;
            case 2:
                        monthName = "February";
                        break;
            case 3:
                        monthName = "March";
                        break;
            case 4:
                        monthName = "April";
                        break;
            case 5:
                        monthName = "May";
                        break;
            case 6:
                        monthName = "June";
                        break;
            case 7:
                        monthName = "July";
                        break;
            case 8:
                        monthName = "August";
                        break;
            case 9:
                        monthName = "September";
                        break;
            case 10:
                        monthName = "October";
                        break;
            case 11:
                        monthName = "November";
                        break;
            case 12:
                        monthName = "December";
                        break;
            default:
                        System.out.println( "Invalid data: you must enter an integer 1-12" );
        }
    return monthName;
    }
    public static int getNumDaysInMonth(int m, int y)
    {
        // Initialize
        int monthDays = 0;

        // Map the numbers to the month names using a switch case
        switch ( m )
        {
            case 1:     
                        monthDays = 31;
                        break;
            case 2:
                        if (isLeapYear(y) == true)
                        {
                            monthDays = 29;
                        }
                        else
                        {
                            monthDays = 28;
                        }
                        break;
            case 3:
                        monthDays = 31;
                        break;
            case 4:
                        monthDays = 30;
                        break;
            case 5:
                        monthDays = 31;
                        break;
            case 6:
                        monthDays = 30;
                        break;
            case 7:
                        monthDays = 31;
                        break;
            case 8:
                        monthDays = 31;
                        break;
            case 9:
                        monthDays = 30;
                        break;
            case 10:
                        monthDays = 31;
                        break;
            case 11:
                        monthDays = 30;
                        break;
            case 12:
                        monthDays = 31;
                        break;
            default:
                        System.out.println( "Invalid data: you must enter an integer 1-12" );
        }
    return monthDays;
    }
    
/****
  The method getStartDay() implements Zeller's Algorithm for determining the day of the
  week the first day of a month is. The method adjusts Zeller's numbering scheme
  for day of week ( 0=Saturday, ..., 6=Friday ) to conform to a day of week number
  that corresponds to ISO conventions (i.e., 1=Monday, ..., 7=Sunday)
  
  Pre-Conditions: The month value, m,  is 1-12
                        The day value, d, is 1-31, or 1-28, 1-29 for February
                        The year value, y, is the full year (e.g., 2012)
                  
 Post-Conditions: A value of 1-7 is returned, representing the first day of the month
                        1 = Monday, ..., 7 = Sunday
****/

    public static int getStartDay( int m, int d, int y )
    {
        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) 
        {
            m = m + 12;
            y = y - 1;
        }
        
        int k = y % 100;      // Calculate year within century
        int j = y / 100;      // Calculate century term
        int h = 0;            // Day number of first day in month 'm'
        
        h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) +
            ( 5 * j ) ) % 7;
        
        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ( ( h + 5 ) % 7 ) + 1;     
        
        return dayNum;
  }

}