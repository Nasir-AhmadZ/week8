package ie.atu;
import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CreateFile {
    public static void main(String[] args)
            throws IOException
    {
        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter the name of a file to add to the directory");
        String str=scanner.nextLine();
        str+=".txt";
        File myFile = new File(str);

            try
            {
                if(myFile.createNewFile()){
                    System.out.println("File "+str+" created successfully created at "+myFile.getAbsolutePath());
                    // attaching a file to PrintWriter
                    FileWriter  fw= new FileWriter(myFile.getAbsolutePath(),true);
                    PrintWriter pw= new PrintWriter(fw);

                    //read each character from the string and write into PrintWriter
                    pw.printf("This is a newly created file\n");
                    System.out.println("Successfully written");

                    // close the file
                    pw.close();
                }
                else
                {
                    System.out.println("File already exists at "+myFile.getAbsolutePath());
                }

            }
            catch (Exception e)
            {
                e.getStackTrace();
            }

    }
}