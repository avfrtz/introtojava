import java.io.*;
public class FileStreamExample 
{
    public static void main( String args [])
    {
        final String fileName = "fileStream.dat";
        byte buffer[] = new byte[128];

        for (int index = 0; index < buffer.length; index++)
        {
            // Load buffer with sequence of byte values
            buffer[index] = (byte)index;
        }

        try
        {
            // Write buffer to file, clear buffer, read data back
            FileOutputStream outFile = new FileOutputStream(fileName);
        outFile.write(buffer);  // Write data to a file
        buffer = new byte[128];  // Get new buffer
        outFile.close();
        FileInputStream inFile = new FileInputStream(fileName);
            inFile.read(buffer);
            inFile.close();
        }
        catch (IOException e) 
        {
            // TODO: handle exception
            System.out.println("I/O Exception: ");
        }

        for (byte dataByte:buffer)
        {
            System.out.print("[" + dataByte + "]");
        }
        System.out.println();
    }    
}
