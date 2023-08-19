import java.io.*;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.println("Enter a text or provide a file path:");

        // Step 2: Read input text or file
        String input = scanner.nextLine();
        String text = "";

        try {
            File file = new File(input);
            if (file.isFile()) {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    text += fileScanner.nextLine() + " ";
                }
                fileScanner.close();
            } else {
                text = input;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }

        // Step 3: Split the text into words
        String[] words = text.split("[\\s.,;!?]+"); // Using regex to split on spaces and punctuation

        // Step 4 & 5: Initialize counter and count words
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;
            }
        }

        // Step 6: Display total word count
        System.out.println("Total word count: " + wordCount);

        // Step 7: Ignoring common words or stop words (you can implement this here)

        // Step 8: Providing statistics (you can implement this here)

        // Step 9: Input validation and file errors have been handled earlier

        // Step 10: Adding a graphical user interface (GUI) (you can implement this using JavaFX or Swing)
    }
}