package Lazo_p2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    //use map of strings to create the word counter
    DuplicateCounter(){
        wordCounter = new HashMap<String,Integer>();
    }

    //use map of strings to create the word counter
    private Map<String, Integer> wordCounter;

    //method instance called "count" that takes in "dataFile"
    void count(String dataFile){

        //initializiing scanner
        Scanner scnr;

        // using try and catch method to gather data
        try {

            //creating scanner with file
            scnr = new Scanner(new File(dataFile));
        }

        // utilizing exceptional IO alerts
        catch (IOException test) {
            System.out.println("error");
            return;
        }

        // counter of numbers of repeats
        while(false !=scnr.hasNext()) {

            //scanning in next line / word
            String line = scnr.next();

            // Using integer to get correct count of line by utilizing "wordCounter"
            Integer numofWords = wordCounter.get(line);

            // if the function decalres null then it is given the value of one(what it was previous)
            if(numofWords == null) {
                numofWords = 1;
            }

            // if there is a duplicate word found it increases the count by 1 for each line(word)
            else {
                numofWords = numofWords + 1;
            }

            // associates the line with the number of words
            // essentially this says how many times that line was repeated
            wordCounter.put(line, numofWords);
        }

    }

    // method called "write"
    void write(String outputFile){

        // using try to put together the counter with the words
        try {
            //Utilizing printwriter object
            PrintWriter scnr = new PrintWriter(new File(outputFile));

            //Returning set that has all the "keys" in the map
            for(String finalCount : wordCounter.keySet()) {
                //what will appear in final file
                scnr.print("Number of: " + finalCount + " is " + wordCounter.get(finalCount)+"\n\n");
            }
            //closing scanner
            scnr.close();

        }
        // utilizing IOException
        catch (IOException total) {
            //incase of errors
           System.out.println(" error ");
        }
    }

}
