package ie.atu;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CreateFile {
    public static void main(String[] args)
            throws IOException
    {

            // Creating a new string to put in the file
            String str="Testing";
            try
            {
                // attaching a file to FileWriter
                FileWriter fw = new FileWriter("C:\\Users\\G00419630@atu.ie\\IdeaProjects\\week8\\File13.txt");

                //read each character from the string and write into FileWriter
                for (int i = 0;i<str.length();i++)
                    fw.write(str.charAt(i));

                System.out.println("Successfully written");

                // close the file
                fw.close();
            }
            catch (Exception e)
            {
                e.getStackTrace();
            }

    }
}