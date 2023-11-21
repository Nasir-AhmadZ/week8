package ie.atu;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CreateFile {
    public static void main(String[] args)
            throws IOException
    {
            try
            {
                int age =18;
                // attaching a file to PrintWriter
                FileWriter  fw= new FileWriter("C:\\Users\\G00419630@atu.ie\\IdeaProjects\\week8\\File13.txt",true);
                PrintWriter pw= new PrintWriter(fw);

                //read each character from the string and write into PrintWriter
                pw.printf("\nThis is an example of Formatting Data\nI am %d years old",age);

                System.out.println("Successfully written");

                // close the file
                pw.close();
            }
            catch (Exception e)
            {
                e.getStackTrace();
            }

    }
}