package ie.atu;
import java.io.File;
import java.io.IOException;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CreateFile {
    public static void main(String[] args) {
        //Specify the file name
        String fileName = "File13.txt";

        // Create a file object
        File myFile = new File(fileName);

        try {
            // Create a new file on the disk
            if (myFile.createNewFile()) {
                System.out.println("File created successefully at " + myFile.getAbsolutePath());
            } else {
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file");
            e.printStackTrace();
        }

    }
}