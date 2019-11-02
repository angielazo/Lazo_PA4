package Lazo_p2;

public class Application {

    public static void main(String[] args) {

        //testing duplicatecounter
        DuplicateCounter test = new DuplicateCounter();

        //input file
        String dataFile = "problem2.txt";
        //output file
        String outputFile = "unique_word_counts.txt";

        //testing calls
        test.count(dataFile);
        test.write(outputFile);
    }

}