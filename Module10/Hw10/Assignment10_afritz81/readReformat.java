/*
 * Ava Fritz
 * 08/07/2023
 * This program reads in a txt file and writes a reformatted file.
 * It then calls another function to
 * read the reformatted file and outputs it to the user.
 */
import java.io.*;
import java.util.Scanner;
import java.util.Scanner;

public class readReformat 
{
    public static void main(String[] args) throws Exception
    {
        // Initialize variables from user input
        String filePath = args[0];
        String destPath = args[1];
        int fileLength = Integer.valueOf(args[2]);
        int lineCounter = 0;  // Count the number of lines in the new file

        // File path is passed as parameter
        File file = new File(filePath);

        // Creating a new buffered reader to read the given file
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // Creating a new buffered writer to write the given file
        BufferedWriter outFile = new BufferedWriter(new FileWriter(destPath));

        // Write the headers
        String header1 = "State\tPopulation\tChild Population\tChild Poverity Population\t% Child Poverty";
        String header2 = "------\t----------\t----------------\t-------------------------\t---------------";
        outFile.write(header1, 0, header1.length());
        outFile.newLine();
        outFile.write(header2, 0, header2.length());
        outFile.newLine();
        // Count the new lines
        lineCounter += 2;

        // Initialize variables for the loop
        String currentEntry = "";
        String currentState = "00";
        String prevState = "01";
        int i = 0;
        int totalPop = 0;
        int totalChild = 0;
        int totalPoverty = 0;
        float percentPoverty = 0.00f;
        String strPercentPoverty = "";
        
        // Loop through all lines of the file
        for (i = 0; i < fileLength; i++ )
        {
            // Read the next line
            currentEntry = reader.readLine();
            // Calculate the current lines values
            currentState = currentEntry.substring(0,2);
            //totalPop = Integer.valueOf((currentEntry.substring(82,90)).trim());
            //totalChild = Integer.valueOf((currentEntry.substring(91,99)).trim());
            //totalPoverty = Integer.valueOf((currentEntry.substring(100,108)).trim());
            if (currentState.equals(prevState))
            {
                // Add the values to the bucket for the current state
                totalPop += Integer.valueOf((currentEntry.substring(82,90)).trim());
                totalChild += Integer.valueOf((currentEntry.substring(91,99)).trim());
                totalPoverty += Integer.valueOf((currentEntry.substring(100,108)).trim());
            }
            else
            {
                // When the state changes, output the current values on the next line and reset the counters
                // Write the state
                outFile.write(prevState, 0, prevState.length());
                // Write the total population
                outFile.write("\t", 0, 1);
                outFile.write(Integer.toString(totalPop), 0, (Integer.toString(totalPop)).length());
                // Write the total child population
                outFile.write("\t\t", 0, 2);
                outFile.write(Integer.toString(totalChild), 0, (Integer.toString(totalChild)).length());
                // Write the total child in poverty population
                outFile.write("\t\t\t", 0, 3);
                outFile.write(Integer.toString(totalPoverty), 0, (Integer.toString(totalPoverty)).length());
                // Calculate the percent of children in poverty
                percentPoverty = ((float)totalPoverty)/totalChild;
                strPercentPoverty = String.format("%4.2f", percentPoverty*100);
                // Write the percent of children in poverty
                outFile.write("\t\t\t\t", 0, 4);
                outFile.write(strPercentPoverty, 0, strPercentPoverty.length());
                // Reset the counters
                totalPop = Integer.valueOf((currentEntry.substring(82,90)).trim());
                totalChild = Integer.valueOf((currentEntry.substring(91,99)).trim());
                totalPoverty = Integer.valueOf((currentEntry.substring(100,108)).trim());
                percentPoverty = 0;
                strPercentPoverty = "";
                // Write a new line for the next state
                outFile.newLine();
                // Count the new line
                lineCounter += 1;
            }
            prevState = currentState;  // Set previous state to current state for reference in the next loop
        }
        outFile.close();  // Close the writing file

        // Call the output method to show the user the results of the reformatted file
        outputReformat(destPath, lineCounter);
    }
    /**
     * This method takes in a file and the length of the file. It reads
     * the file line by line and displays the results to the user.
     * 
     * precondition: destPath is the path to a file
     * precondition: fileLength is the length of the file
     * postcondition: user views contents of file in destPath
     * 
     * @author Ava Fritz
     */
    public static void outputReformat(String destPath, int fileLength) throws Exception
    {
        // File path is passed as parameter
        File file = new File(destPath);

        // Creating a new buffered reader to read the given file
        BufferedReader reader = new BufferedReader(new FileReader(file));

        // Print the initial file information
        System.out.println("File: " + destPath + "\n");

        // Initialize variables for loop
        int i = 0;

        // Loop through all the lines in the file
        for (i = 0; i < fileLength; i++ )
        {
            // Print out the next line
            System.out.println(reader.readLine());
        }
    }
}