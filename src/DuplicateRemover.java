import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

// Class created for duplicate remover
public class DuplicateRemover {

    // New method called remove to eliminate duplicates
    void remove(String dataFile) throws IOException {

        // Creating a scanner for the file going to be read
        // use File Reader to get an "input stream" of the file being read
        Scanner scnr = new Scanner(new FileReader(dataFile));

        // This will be the word they will be entering
        scnr.next();
        String entry;

        // While there is something being scanned in (has next value)
        while(false != scnr.hasNext()){
            entry = scnr.next();
            uniqueWords.add(entry);
        }

        scnr.close();

    }

    // using hashSet for the group of works used format from modules
    private HashSet<String> uniqueWords = new HashSet<>();

    // instance method called write that takes in outputFile
    void write(String outputFile) throws IOException {

        // Finding the txt file and naming it problem1
        // Setting it equal to the new output file that is going to be created
        File problem1 = new File(outputFile);

        // Checking to see if problem1 file already exists (for the new one- the output)
        boolean exists = problem1.exists();

        // FileWriter overrides write() methods
        // will throw IOException
        FileWriter rewrite;

        // if it does exist follow this if statement
        if(exists) {

            // This is so when the new output file is created it would be rewritten
            rewrite = new FileWriter(problem1,true);

            // Looking at the unique words to recreate in output file
            for (String newString : uniqueWords) {
                rewrite.write(newString + "\n");
            }

            // Closing file
            rewrite.close();

            // Printing to finalize/check
            System.out.println("Congratulations. Data transformation complete!");

        }

        // If the file does not already exist it must be created here
        else {

            // Creating the new file
            rewrite = new FileWriter(problem1);

            // Creating a for loop to identify the unique values
            for (String newString : uniqueWords) {
                rewrite.write(newString + "\n");
            }

            // Closing the new file
            rewrite.close();
            System.out.println("Congratulations. Data transformation complete!");
        }

    }

}


