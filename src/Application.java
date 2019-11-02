import java.io.IOException;

public class Application {

    // Testing that duplicate remover works/ makes sense
    public static void main(String[] args) throws IOException {

        DuplicateRemover tester = new DuplicateRemover();

        // Removing duplicates
        tester.remove("problem1.txt");

        // Creating new file with unique words
        tester.write("unique_words.txt");

    }

}
