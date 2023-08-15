import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharBufferedStreamExample 
{
    public static void main(String args[])
    {
        final String fileName = "test.txt";
        char buffer[] = new char[128];

        for (int index = 0; index < buffer.length; index++)
        {
            // Load buffer with sequence of char values
            buffer[index] = (char)index;
        }

        Path file = "./test.txt";
try (InputStream in = Files.newInputStream(file);
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(in))) {
    String line = null;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException x) {
    System.err.println(x);
}
        //for (char dataChar:buffer)
        //{
        //    System.out.print("[" + dataChar + "]");
        //}

        //System.out.println();
    }   
}
